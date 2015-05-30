import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Manipulador {
	
	public static void escritor(String path) throws IOException {

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));

		Scanner key = new Scanner(System.in);

		int result=0;
		
		int x = key.nextInt();
		String operador = key.next();
		int y = key.nextInt();

		if (operador.equals("+")){
			result = x + y;
		}else
			if (operador.equals("-")){
				result = x - y;
			}else
				if (operador.equals("*")){
					result = x * y;
				}else
					if (operador.equals("/")){
						result = x / y;
					}
		
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		buffWrite.append(data.format(new Date()));
		buffWrite.append("\n"+ x + " " + operador + " " + y + " = " + result + "   \n");
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