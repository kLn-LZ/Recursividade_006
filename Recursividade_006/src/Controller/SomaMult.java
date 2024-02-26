package Controller;



public class SomaMult {
	
	public SomaMult () {
		
		super();
	}


	public int funcSomaMult (int a, int b) {
		
		
		if (b == 1) {
			
			return a;
		}
		
		
		
		return a + funcSomaMult (a, b - 1);
		
	}
	
	
	
}
