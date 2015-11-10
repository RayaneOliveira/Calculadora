import java.io.File;
import java.io.IOException;

public class Consumidor {
	
	public static void main (String []args){
		
		String endereço = ("arquivo.txt");
		Manipulador arq = new Manipulador();
		File arquivo = new File("arquivo.txt");
		
		int cont=1;
		
		while(cont==1){
			
			if(arquivo.exists()){
				
				try {
					arq.leitor(endereço);
					arquivo.delete();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
