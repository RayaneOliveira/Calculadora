import java.util.Scanner;

public class Main{
	
	public static void main (String[] args)
	{
		Scanner key = new Scanner(System.in);

		int x = key.nextInt();
		String operador = key.next();
		int y = key.nextInt();
			
		Calculadora c = new Calculadora();
			
		c.calculando(x, operador, y);
	}
		
}