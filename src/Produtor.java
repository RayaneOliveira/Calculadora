import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Produtor {

	public static void main(String args[]) {
		
		Scanner key = new Scanner(System.in);
		
		while (true) {
			
			int x = key.nextInt();
			String operador = key.next();
			int y = key.nextInt();
			
			String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
			long pid = Long.parseLong(processName.split("@")[0]);
			PrintWriter input;
			
			try {
				input = new PrintWriter(new FileWriter(new File(pid + "Input.txt"), true), true);
				input.println(x);
				input.println(operador);
				input.println(y);
				input.close();
				System.out.println("Aguardando resposta do servidor.");
				
				File arquivo = new File(pid + "Output.txt");

				while (arquivo.length() == 0);
				
				BufferedReader output = new BufferedReader(new FileReader(arquivo));
				System.out.println();
				System.out.println("Resultado:" + output.readLine());
				output.close();
				arquivo.delete();
				
			} catch (IOException erro) {
				
				erro.printStackTrace();
			}
		}
	}
}