import java.util.Scanner;

public class Calculadora {
	
	public static void main (String [] args){
		
		Scanner key = new Scanner (System.in);
		
		int x=0, y=0, result=0, op=0;
		
		System.out.println("\n\t\t\t\t CALCULADORA");
		
		do{
			
			System.out.println ("\nEscolha a opera��o que deseja realizar:");
			System.out.println ("[1] - Adi��o");
			System.out.println ("[2] - Subtra��o");
			System.out.println ("[3] - Multiplica��o");
			System.out.println ("[4] - Divis�o");
			System.out.println ("[5] - Sair");
			System.out.println ("\nEntre com sua op��o:");
			op = key.nextInt();
			
			switch (op){
			
			case 1: 

				System.out.println("Entre com o primeiro valor: ");
				x = key.nextInt();
				
				System.out.println("Entre com o segundo valor: ");
				y = key.nextInt();
				
				result = x + y;
				
				System.out.println("\t\t\t RESULTADO: " + result+ "\t");	
				
				break;
				
			case 2:
				
				System.out.println("Entre com o primeiro valor: ");
				x = key.nextInt();
				
				System.out.println("Entre com o segundo valor: ");
				y = key.nextInt();
				
				result = x - y;
				
				System.out.println("\t\t\t RESULTADO: " + +result+ "\t");
				
				break;
				
			case 3:
				
				System.out.println("Entre com o primeiro valor: ");
				x = key.nextInt();
				
				System.out.println("Entre com o segundo valor: ");
				y = key.nextInt();
				
				result = x * y;
				
				System.out.println("\t\t\t RESULTADO: " + +result+ "\t");	
				
				break;
				
			case 4:
				
				System.out.println("Entre com o primeiro valor: ");
				x = key.nextInt();
				
				System.out.println("Entre com o segundo valor: ");
				y = key.nextInt();
				
				result = x / y;
				
				System.out.println("\t\t\t RESULTADO: " + +result+ "\t");	
				
				break;
				
			default:
				
				System.out.println ("Digite uma op��o v�lida!");
				break;
			}
			
		} while (op != 4);

	}

}
