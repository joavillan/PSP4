package ej2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.smtp.AuthenticatingSMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.smtp.SimpleSMTPHeader;

import utiles.Libreria;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Libreria a1 = new Libreria();
		String usuario;
		int usuariosCorrectos=0;
		do {
			usuario = a1.excepcionstringcontexto("Introduzca usuario");
			
			String clave = a1.excepcionstringcontexto("Introduzca contraseña");
			
			FTPClient cliente=new FTPClient();
			String servFTP="localhost";
			System.out.println("Nos conectamos a: "+servFTP);
			
			
			String directorio="/LOG/";
			
			try {
				cliente.connect(servFTP);
				cliente.enterLocalPassiveMode();
				
				boolean login=cliente.login(usuario, clave);
				
				if(login) {
					System.out.println("Login correcto");
				
				System.out.println("Directorio actual: "+cliente.printWorkingDirectory());
				FTPFile[] files=cliente.listFiles();
				System.out.println("Ficheros en el directorio actual: "+files.length);
				
				String tipos[]= {"Fichero","Directorio","Enlace simb."};

				for (int i = 0; i < files.length; i++) {
					System.out.println("\t"+files[i].getName()+" => "+tipos[files[i].getType()]);
				}

				cliente.changeWorkingDirectory(directorio);
				System.out.println("Directorio actual: "+cliente.printWorkingDirectory());
				files=cliente.listFiles();
				System.out.println("Ficheros en el directorio actual: "+files.length);
				
				String text="\nHora de conexion: "+LocalDateTime.now();
				try (ByteArrayInputStream local = new ByteArrayInputStream(text.getBytes("UTF-8"))) {
				    cliente.appendFile("LOG.txt", local);
				} catch (IOException ex) {
				    throw new RuntimeException("Uh-oh", ex);
				}
				
				boolean logout=cliente.logout();
				
				if(logout)
					System.out.println("Logout del servidor FTP");
				else
					System.out.println("Error al hacer logout");
				cliente.disconnect();
				System.out.println("Desconectado");
				usuariosCorrectos++;
				}else {
					System.out.println("Login incorrecto");
					cliente.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(!usuario.equalsIgnoreCase("*"));
		
		
		
		
		AuthenticatingSMTPClient client=new AuthenticatingSMTPClient();
		
		String server="smtp.gmail.com";
		String username="pruebapspnds@gmail.com";
		String password="ppsp1234";
		int puerto=587;
		String remitente="pruebapspnds@gmail.com";
		
		try {
			int respuesta;
			KeyManagerFactory kmf=KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			kmf.init(null,null);
			KeyManager km=kmf.getKeyManagers()[0];
			
			client.connect(server,puerto);
			System.out.println("1 - "+client.getReplyString());
			client.setKeyManager(km);
			
			respuesta=client.getReplyCode();
			if(!SMTPReply.isPositiveCompletion(respuesta)) {
				client.disconnect();
				System.err.println("Conexion rechazada");
				System.exit(1);
			}
				
				client.ehlo(server);
				System.out.println("2 - "+client.getReplyString());
				
				if(client.execTLS()) {
					System.out.println("3 - "+client.getReplyString());
					
					if(client.auth(AuthenticatingSMTPClient.AUTH_METHOD.PLAIN, username, password)) {
						System.out.println("4 - "+client.getReplyString());
						String destino1="pruebapspnds@gmail.com";
						String asunto="Numero de conexiones correctas";
						String mensaje="Se han conectado correctamente "+usuariosCorrectos+" usuarios";
						
						SimpleSMTPHeader cabecera=new SimpleSMTPHeader(remitente,destino1,asunto);
						
						client.setSender(remitente);
						client.addRecipient(destino1);
						System.out.println("5 - "+client.getReplyString());
						
						Writer writer=client.sendMessageData();
						
						if(writer==null) {
							System.out.println("FALLO AL ENVIAR DATA");
							System.exit(1);
						}
						
						writer.write(cabecera.toString());
						writer.write(mensaje);
						writer.close();
						System.out.println("6 - "+client.getReplyString());
						
						boolean exito=client.completePendingCommand();
						System.out.println("7 - "+client.getReplyString());
						
						if(!exito) {
							System.out.println("FALLO AL FINALIZAR TRANSACCION");
							System.exit(1);
						}else
							System.out.println("Mensaje enviado con EXITO");
					}else
							System.out.println("USUARIO NO AUTENTICADO");
				}else
					System.out.println("FALLO AL EJECUTAR STARTLLS");
		} catch (Exception e) {
			System.err.println("Could not connect to server");
			e.printStackTrace();
			System.exit(1);
		}
		try {
			client.disconnect();
		} catch (IOException f) {
			f.printStackTrace();
		}
		
		System.out.println("Fin de envio");
		System.exit(0);
	}

}
