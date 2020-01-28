package utiles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;

public class Libreria {
BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * Controla la excepciones de la introducción de los datos enteros
	 * @return int
	 * @throws IOException
	 */
	public int excepcionint() throws IOException {
		int numeroint = 0;
		boolean n1=true;
		do {
			try {
				numeroint=Integer.parseInt(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero.");
				n1=false;
			}
		} while (n1!=true);
			return numeroint;
	}
	
	public int excepcionintcontexto(String txt) throws IOException {
		System.out.println(txt);
		int numeroint = 0;
		boolean n1=true;
		do {
			try {
				numeroint=Integer.parseInt(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero.");
				n1=false;
			}
		} while (n1!=true);
			return numeroint;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos float
	 * @return float
	 * @throws IOException
	 */
	public float excepcionfloat() throws IOException {
		float numerofloat = 0;
		boolean n1=true;
		do {
			try {
				numerofloat=Float.parseFloat(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerofloat;
	}
	
	public float excepcionfloatcontexto(String txt) throws IOException {
		System.out.println(txt);
		float numerofloat = 0;
		boolean n1=true;
		do {
			try {
				numerofloat=Float.parseFloat(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerofloat;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos double
	 * @return double
	 * @throws IOException
	 */
	public double excepciondouble() throws IOException {
		double numerodouble = 0;
		boolean n1=true;
		do {
			try {
				numerodouble=Double.parseDouble(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerodouble;
	}
	
	public double excepciondoublecontexto(String txt) throws IOException {
		System.out.println(txt);
		double numerodouble = 0;
		boolean n1=true;
		do {
			try {
				numerodouble=Double.parseDouble(teclado.readLine());
				n1=true;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Asegúrate de introducir un número.");
				n1=false;
			}
		} while (n1!=true);
			return numerodouble;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos enteros y que el valor sea positivo
	 * @return int
	 * @throws IOException
	 */
	public int excepcionpos() throws IOException {
		int numeropos = 0;
		boolean n1=true;
		do {
			try {
				numeropos=Integer.parseInt(teclado.readLine());
				if (numeropos>=0) {
					n1=true;
				}else if (numeropos<0) {
					System.out.println("Error. Introduce un número entero positivo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero positivo.");
				n1=false;
			}
		} while (n1!=true);
		return numeropos;
	}
	
	public int excepcionposcontexto(String txt) throws IOException {
		System.out.println(txt);
		int numeropos = 0;
		boolean n1=true;
		do {
			try {
				numeropos=Integer.parseInt(teclado.readLine());
				if (numeropos>=0) {
					n1=true;
				}else if (numeropos<0) {
					System.out.println("Error. Introduce un número entero positivo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero positivo.");
				n1=false;
			}
		} while (n1!=true);
		return numeropos;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos enteros y que el valor sea negativo
	 * @return int
	 * @throws IOException
	 */
	public int excepcionneg() throws IOException {
		int numeroneg = 0;
		boolean n1=true;
		do {
			try {
				numeroneg=Integer.parseInt(teclado.readLine());
				if (numeroneg<=0) {
					n1=true;
				}else if (numeroneg>0) {
					System.out.println("Error. Introduce un número entero negativo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero negativo.");
				n1=false;
			}
		} while (n1!=true);
		return numeroneg;
	}
	
	public int excepcionnegcontexto(String txt) throws IOException {
		System.out.println(txt);
		int numeroneg = 0;
		boolean n1=true;
		do {
			try {
				numeroneg=Integer.parseInt(teclado.readLine());
				if (numeroneg<=0) {
					n1=true;
				}else if (numeroneg>0) {
					System.out.println("Error. Introduce un número entero negativo.");
					n1=false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("ERROR. Introduce un número entero negativo.");
				n1=false;
			}
		} while (n1!=true);
		return numeroneg;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos String
	 * @return String
	 * @throws IOException
	 */
	public String excepcionstring() throws IOException {
		String estring = null;
		boolean n1=true;
		do {
			try {
				estring=teclado.readLine();
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce una cadena de caracteres.");
				n1=false;
			}
		} while (n1!=true);
		return estring;
	}
	
	public String excepcionstringcontexto(String txt) throws IOException {
		System.out.println(txt);
		String estring = null;
		boolean n1=true;
		do {
			try {
				estring=teclado.readLine();
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce una cadena de caracteres.");
				n1=false;
			}
		} while (n1!=true);
		return estring;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos boolean
	 * @return boolean
	 * @throws IOException
	 */
	public boolean excepcionboolean() throws IOException {
		boolean booldato = false;
		boolean n1=true;
		do {
			try {
				booldato=Boolean.parseBoolean(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return booldato;
	}
	
	public boolean excepcionbooleancontexto(String txt) throws IOException {
		System.out.println(txt);
		boolean booldato = false;
		boolean n1=true;
		do {
			try {
				booldato=Boolean.parseBoolean(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return booldato;
	}
	
	/**
	 * Controla la excepciones de la introducción de los datos long
	 * @return long
	 * @throws IOException
	 */
	public long excepcionlong() throws IOException {
		long longdato = 0;
		boolean n1=true;
		do {
			try {
				longdato=Long.parseLong(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return longdato;
	}
	
	public long excepcionlongcontexto(String txt) throws IOException {
		System.out.println(txt);
		long longdato = 0;
		boolean n1=true;
		do {
			try {
				longdato=Long.parseLong(teclado.readLine());
			} catch (Exception ex) {
				System.out.println("ERROR. Introduce un valor booleano.");
				n1=false;
			}
		} while (n1!=true);
		return longdato;
	}
	
	public void rellenararray(int array[], int valor) {
		for (int i = 0; i < array.length; i++) {
			array[i]=valor;
		}
	}
	
	/**
	 * Escribe la matriz deseada por pantalla
	 * @param matriz
	 */
	public void escribirmatriz(int matriz [][]) {
		int contador=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				contador++;
				if (contador== matriz.length) {
					System.out.println("0"+matriz[i][j]+" ");
					contador=0;
				}else {
					System.out.print("0"+matriz[i][j]+" ");
				}
			}
		}
	}
	
	/**
	 * Invierte cadena de caracteres.
	 * @param cadena
	 * @return
	 */
	public String invertircadena(String cadena) {
		String cadenainvertida = "";
		for (int i = cadena.length()-1; i>=0; i--) {
			cadenainvertida+=cadena.charAt(i);
		}
		return cadenainvertida;
	}
	
	/**
	 * Genera la cantidad de dígitos de la sucesión de Fibonacci deseada
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n>1){
		       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
		    }
		    else if (n==1) {  // caso base
		        return 1;
		    }
		    else if (n==0){  // caso base
		        return 0;
		    }
		    else{ //error
		        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		        return -1; 
		    }
	}
	
	/**
	 * Imprime la sucesión de Fibonacci
	 * @throws IOException
	 */
	public void imprimirfibonacci() throws IOException {
		int n = excepcionint();
		for (int a = 0; a < n; a++) {
			System.out.print(fibonacci(a)+ ", ");
		}
	}
	
	/**
	 * Ordena un array de menor a mayor
	 * @param array
	 */
	public void metodoburbuja(int array[]) {
		int temp=0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	/**
	 * Ordena un array de menor a mayor
	 * @param A
	 */
	public void insercionDirecta(int A[]){
	    int p, j;
	    int aux;
	    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
	              aux = A[p]; // el final, guardamos el elemento y
	              j = p - 1; // empezamos a comprobar con el anterior
	              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
	                                                                    // valor de aux sea menor que los
	                             A[j + 1] = A[j];       // de la izquierda, se desplaza a
	                             j--;                   // la derecha
	              }
	              A[j + 1] = aux; // colocamos aux en su sitio
	    }
	}
	
	/**
	 * Genera una matriz de n*n con una ordenación en forma de caracol
	 * @param n
	 * @param x
	 * @return M (matriz)
	 */
	public int[][] generarmatrizcaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) { // Se divide entre dos ya que hay la mitad de "n" de cada caso2
            for (int i = a; i <= n - a; i++) {//Fila hacia derecha
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {//Columna hacia abajo
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {//FIla hacia la izquierda
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {//Columna hacia arriba
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }

    /**
     * Muestra Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1
     * @param M matriz a mostrar
     * @param f numero de filas de la matriz
     * @param c numero de columnas de la matriz
     */
    public void mostrarmatrizcaracol(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Determina si una cadena es un palindromo
     * @param cadena
     */
    public void palindromo (String cadena) {
    	int ini=0;
		int des = cadena.length()-1;
		boolean bError = false;
		
		while ((ini<des) && (!bError)){
			
			if (cadena.charAt(ini)==cadena.charAt(des)){				
				ini++;
				des--;
			} else {
				bError = true;
			}		
		}
		
		if (!bError) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
    }
    
    /**
     * Determina si un valor entero es capicua o no
     * @param entero
     */
    public void capicua (int entero) {
    	String cadena = Integer.toString(entero);
		String cadenainvertida = "";
		
		if (cadena.length()>1) {
			for (int i = cadena.length()-1; i>=0; i--) {
				cadenainvertida+=cadena.charAt(i);
			}
			int enteroinvertido = Integer.parseInt(cadenainvertida);
			if (entero==enteroinvertido) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}else {
			System.out.println("No es capicua");
		}
    }
    
    /**
	 * Método que halla el mayor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar el mayor valor
	 * @return Retorna el mayor valor de la matriz.
	 * */
	public int mayorenmatriz(int[][] matriz) {
		int aux=matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]>aux)
					aux=matriz[i][j];
			}
		}
		return aux;
	}
	
	/**
	 * Método que halla las posiciones del mayor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar las posiciones del mayor valor
	 * @return Retorna las posiciones del mayor valor de una matriz.
	 * */
	public void posicionesMayorEnLaMatriz(int[][] matriz) {
		int mayor=mayorenmatriz(matriz);
		System.out.println("El mayor número se encuentra en la/s posición/es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(mayor==matriz[i][j])
					System.out.print("["+i+"]["+j+"]  ");
			}
		}
	}
    
    /**
	 * Indica el menor valor de una matriz
	 * @param matriz
	 * @return Retorna el menor valor de la matriz
	 * */
	public int menorenmatriz(int[][] matriz) {
		int aux=matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]<aux)
					aux=matriz[i][j];
			}
		}
		return aux;
	}
	
	/**
	 * Método que halla las posiciones del menor valor de una matriz
	 * @param matriz Matriz de la cual deseamos hallar las posiciones del menor valor
	 * @return Retorna las posiciones del menor valor de una matriz.
	 * */
	public void posicionesMenorEnLaMatriz(int[][] matriz) {
		int menor=menorenmatriz(matriz);
		System.out.println("El menor número se encuentra en la/s posición/es: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(menor==matriz[i][j])
					System.out.print("["+i+"]["+j+"]  ");
			}
		}
	}
	
	/**
	 * Método que halla el mayor valor de una fila.
	 * @param matriz Matriz de la cual deseamos sacar el valor
	 * @param fila Fila de la cual queremos sacar el mayor valor
	 * @return Mayor valor de la fila
	 * */
	public int mayorenfila(int[][] matriz, int fila) {
		int aux=matriz[fila][0];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[fila][i]>aux)
				aux=matriz[fila][i];
		}
		return aux;
	}
	
	/**
	 * Método que halla el mayor valor de una columna.
	 * @param matriz Matriz de la cual deseamos sacar el valor
	 * @param columna Columna de la cual queremos sacar el mayor valor
	 * @return Mayor valor de la columna
	 * */
	public int mayorencolumna(int[][] matriz, int columna) {
		int aux=matriz[0][columna];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][columna]>aux)
				aux=matriz[i][columna];
		}
		return aux;
	}
	
	/**
	 * Método que halla el menor valor de una fila.
	 * @param matriz Matriz de la cual deseamos sacar el valor
	 * @param fila Fila de la cual queremos sacar el menor valor
	 * @return Menor valor de la fila
	 * */
	public int menorenfila(int[][] matriz, int fila) {
		int aux=matriz[fila][0];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[fila][i]<aux)
				aux=matriz[fila][i];
		}
		return aux;
	}
	
	/**
	 * Método que halla el menor valor de una columna.
	 * @param matriz Matriz de la cual deseamos sacar el valor
	 * @param columna Columna de la cual queremos sacar el menor valor
	 * @return Menor valor de la columna
	 * */
	public int menorencolumna(int[][] matriz, int columna) {
		int aux=matriz[0][columna];
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][columna]<aux)
				aux=matriz[i][columna];
		}
		return aux;
	}
    
    /**
  	 * Método público que haya los puntos de silla de una matriz (Los menores números
  	 * en su fila, pero los mayores en su columna)
  	 * @param matriz Matriz de la cual queremos hallar los puntos de silla
  	 * */
	public void puntoDeSilla(int[][] matriz) {

		int aux; // Variable auxiliar

		// Para cada fila, buscamos el menor valor existente y guardamos ese valor en un
		// auxiliar.
		for (int i = 0; i < matriz.length; i++) {
			aux = menorenfila(matriz, i);
			for (int j = 0; j < matriz[i].length; j++) {
				if (aux == matriz[i][j]) { // Ahora, si el valor coincide en la fila, bloqueamos la columna y
											// comprobamos
					if (aux == mayorencolumna(matriz, j))
						System.out.println(matriz[i][j] + "(Posición:[" + i + "," + j + "]" + " es un punto de silla");
				}
			}
		}
	}
	
	/**
	 * Método público que extrae un punto de silla de una matriz, junto con 
	 * sus coordenadas.
	 * @param matriz Matriz de la cual queremos extraer el punto de silla
	 * @return Array con la siguiente estructura [puntoDeSilla, coordenadaI, coordenadaJ, puntoDeSilla, coordenadaI, coordenadaJ,...]
	 * */
	public int[] extraerPuntoDeSilla(int[][] matriz) {
		int aux; // Variable auxiliar
		int cont = 0; // Variable para contar los puntos de silla
		int[] array; // Aquí guardaremos los puntos de silla y sus posiciones

		for (int i = 0; i < matriz.length; i++) {
			aux = menorenfila(matriz, i);
			for (int j = 0; j < matriz[i].length; j++) {
				if (aux == matriz[i][j]) { // Ahora, si el valor coincide en la fila, bloqueamos la columna y
											// comprobamos
					if (aux == mayorencolumna(matriz, j)) {
						System.out.println(matriz[i][j] + "(Posición:[" + i + "," + j + "]" + " es un punto de silla");
						cont++;
					}
				}
			}
		}

		array = new int[cont * 3]; // Le damos tamaño al array
		cont = 0;

		for (int i = 0; i < matriz.length; i++) {
			aux = menorenfila(matriz, i);
			for (int j = 0; j < matriz[i].length; j++) {
				if (aux == matriz[i][j]) { // Ahora, si el valor coincide en la fila, bloqueamos la columna y
											// comprobamos
					if (aux == mayorencolumna(matriz, j)) {
						array[cont] = aux;
						cont++;
						array[cont] = i;
						cont++;
						array[cont] = j;
						cont++;
					}
				}
			}
		}

		return array;
	}
	public void nif(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Libreria a1=new Libreria();
			
			
			
			boolean num=false;
			
			do {
				System.out.print("Introduce DNI a comprobar: ");
				String nif = a1.excepcionstring();
				
				if (nif.length()==9) {
					for (int i = 0; i <= 7; i++) {
						if (nif.charAt(i)=='0' || nif.charAt(i)=='1' || nif.charAt(i)=='2' || nif.charAt(i)=='3' || nif.charAt(i)=='4' || nif.charAt(i)=='5' || nif.charAt(i)=='6' || nif.charAt(i)=='7' || nif.charAt(i)=='8' || nif.charAt(i)=='9') {
							num=true;
						}else {
							num=false;
							System.out.println("DNI incorrecto");
							break;
						}
					}
				
					String letra = Character.toString(nif.charAt(8));
					if (num==true) {
						boolean alfa = Pattern.matches("^[a-zA-Z]*$", letra);
						if (alfa==true) {
							num=true;
						}else if (alfa==false) {
							num=false;
							System.out.println("DNI incorrecto");
						}
					}else {
						num=false;
					}
				}else {
					System.out.println("DNI incorrecto");
					num=false;
				}
			} while (num!=true);

			if (num==true) {
				System.out.println("DNI correcto");
			}
			
	}
	
	public int aleatorio(int inicio, int fin) {
		return (int) (Math.random() * (fin - inicio+1) + inicio);
	}
	
	public void crearlistrandom(List <Integer> L, int longitud) throws IOException {
		int inicio = excepcionint();
		int fin=excepcionint();
		for (int i = 0; i < longitud; i++) {
			L.add(aleatorio(inicio, fin));
		}
	}
	
	public void crearlist(List <Integer> L, int longitud) throws IOException {
		for (int i = 0; i < longitud; i++) {
			L.add(excepcionint());
		}
	}
	
	public void verarraylist(List <Integer> L) {
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i));
		}
	}
	
	public void sumararraylist(List <Integer> L) {
		int total = 0;
		int temp = 0;
		for (int i = 0; i < L.size(); i++) {
			total = L.get(i) + temp;
			temp = total;
		}
	}
	
	public boolean trueFalse(String a) {
		if (a.equalsIgnoreCase("s")) {
			return true;
		}else if (a.equalsIgnoreCase("n")) {
			return false;
		} else {
			return false;
		}
	}
}
