package CalculadoraArquivo;

import java.io.IOException;

public class Main {
	
	public static void main (String [] args) throws IOException{
		
		String path = "C:\\Java\\android\\workspace\\RecuperaçãoPAD\\src\\CalculadoraArquivo\\arquivo.txt";
		
		while(true){
			Manipulador.escritor(path);
			Manipulador.leitor(path);
		}
		
	}

}
