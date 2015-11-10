import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class calculadora {
	
	public static void main (String [] args){
		
		Scanner key = new Scanner (System.in);
	    
		
		int x=0, y=0, result=0, op=1; 
		String operador;
		
		System.out.println("\n\tCALCULADORA");
		
		 while (op == 1){

			x = key.nextInt();
			operador = key.next();	
			y = key.nextInt();
				
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
				
			System.out.println("\tRESULTADO: " + result+ "\t");	
			
			try{
				
				FileWriter arquivo = new FileWriter ("calculadora.txt", true);
			
				PrintWriter pw = new PrintWriter(arquivo);
				
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());  
				String date = new SimpleDateFormat("dd/MM/yyyy Hh:Mm").format(timestamp.getTime());   
				pw.println(date);
				pw.println("Operandos: " + x + " e " + y + "");
				pw.println("Operador: " + operador + "");
				pw.close();
				arquivo.close();
			
			}catch(IOException ex){
			  
				ex.printStackTrace();
				
			}
			
			System.out.println ("\nDeseja continuar usando a calculadora? \n\n\t[1] - Sim  [2] - Não");
			op = key.nextInt();
			
		}

	}

}