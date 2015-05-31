package CalculadoraArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Manipulador {
	
	public static void escritor (String path) throws IOException{
		
		Scanner key = new Scanner (System.in);
		
		BufferedWriter bW = new BufferedWriter(new FileWriter(path, true));
		
		Calculadora c = new Calculadora();
		
		int result=0;
		
		int x = key.nextInt();
		String operador = key.next();
		int y = key.nextInt();
		
		if (operador.equals("+")){
			result = c.soma(x, y);
			System.out.println(result);
		}else
			if (operador.equals("-")){
				result = c.subtração(x, y);
				System.out.println(result);

			}else
				if (operador.equals("*")){
					result = c.multiplicação(x, y);
					System.out.println(result);

				}else
					if (operador.equals("/")){
						result = c.divisão(x, y);
						System.out.println(result);

					}
		
		bW.append("\n\nData: ");
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		bW.append(data.format(new Date()));
		bW.append("\nHorário: ");
		SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss");
		bW.append(hora.format(new Date()));
		bW.append("\nOperação: ");
		bW.append(x + " " + operador + " " + y + " = " + result);
		bW.close();
		
	}
	
	public static void leitor (String path) throws IOException{
		
		BufferedReader bR = new BufferedReader(new FileReader(path));
		
		String linha = " ";
		
		while(true){
			
			if (linha != null){
				System.out.println(linha);
			} else
				
				break;
				
				linha = bR.readLine();
		}
		
		bR.close();
		
	}

}
