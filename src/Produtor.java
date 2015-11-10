import java.io.IOException;
import java.util.Scanner;

public class Fornecedor {

	public static void main(String[] args) throws IOException {

		Scanner key = new Scanner(System.in);
		
		int x, y, res=0;
		char operador;

		x = key.nextInt();
		operador = key.next().charAt(0);
		y = key.nextInt();
		
		Manipulador.escritor(x, y, operador);

	}
}
