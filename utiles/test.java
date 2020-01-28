package utiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Libreria a1 = new Libreria();

		List<Integer> Al = new ArrayList<Integer>();
		a1.crearlist(Al, 50);
		a1.verarraylist(Al);
		
	}

}
