import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		String path = "c:\\Java\\android\\workspace\\teste4\\src\\arquivo.txt";
	
		while(true) {
			
			Manipulador.escritor(path);
			Manipulador.leitor(path);
		} 
	}
}