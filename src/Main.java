public class Main {

	public static void main(String[] args) {
		
		Syncronized t = new Syncronized();
		
		do{
			
			t.run();
			
			System.out.println(t.calculate());
			
		} while(true);
	}
}