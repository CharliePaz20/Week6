package wkfive;
public class SpacedLogger implements Logger {

	
	public void log(String str) {
		
	StringBuilder log = new StringBuilder();
		
	for (int i = 0; i < str.length(); i++) {
		log.append(str.charAt(i) + "  ");
	}	
	System.out.println(log);
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		
	}	

}

