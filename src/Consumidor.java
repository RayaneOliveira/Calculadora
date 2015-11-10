import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class Consumidor {

	public static void main(String[] args) {
		
		while (true) {
			
			File arq = new File(".");
			String[] arquivos = arq.list();
			
			for (int i = 0; arquivos.length != i; i++) {
				if (arquivos[i].contains("input")) {
					try {
						String pid = arquivos[i].substring(0,arquivos[i].indexOf("input"));
						System.out.println("Recebendo dados de "+arquivos[i]);
						BufferedReader entrada = new BufferedReader(new FileReader(new File(arquivos[i])));
						
						while (!input.ready());
						
						int x = Integer.parseInt(input.readLine());
						String operador = input.readLine();
						int y = Integer.parseInt(input.readLine());
						
						Calculadora c = new Calculadora();
						
						PrintWriter output = new PrintWriter(new FileWriter(new File(pid + "Output.txt"), true));
						System.out.println("Operação concluída!");
						output.println(c.calcula(x, operador, y));
						output.close();
						output.close();
						File input = new File(pid + "Input.txt");
						input.delete();
						System.out.println("Feito!");
						
					} catch (FileNotFoundException erro) {
						
						e.printStackTrace();
						
					} catch (IOException erro) {
						
						erro.printStackTrace();
					}

				}
			}
		}
	}
}