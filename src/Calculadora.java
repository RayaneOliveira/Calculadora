import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
	
	public static void escritor(int x, int y, char operador) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("arquivo.txt", true));

		int res =0;
		
		switch (operador) {
		
			case '+': 
			{
				res = x + y;
				System.out.println(res);
				break;
			}
			case '-': 
			{
				res = x - y;
				System.out.println(res);
				break;
			}
			case '*': 
			{
				res = x * y;
				System.out.println(res);
				break;
			}
			case '/':
			{
				res = x / y;
				System.out.println(res);
				break;
			}
		}
		
		buffWrite.append(x + " " + operador + " " + y + " = " + res + "   \n");
		buffWrite.close();
	}

	public static void leitor(String path) throws IOException {

		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		
		buffRead.close();
	}

}
