package wkfive;

public class AsteriskLogger implements Logger {

	
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	
	public void error(String error) {
		String a = error; 
		StringBuilder str = new StringBuilder(); 
		str.append("***ERROR: " + a + "***");

		addBoxTopAndBottom(str); 
		System.out.println(str);
		addBoxTopAndBottom(str); 

		}
		
	private void addBoxTopAndBottom(StringBuilder str) {
		int l = str.length(); 
		
		for (int i=0; i<l; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}