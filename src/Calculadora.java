public class Calculadora  {

	int x, y, result=0;
	String operador;

	public void calculando(int x, String operador, int y) {

		this.x = x;
		this.operador = operador;
		this.y = y;
		
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
			
		System.out.println(result);
	}
}
