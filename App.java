package wkfive;


public class App {

	public static void main(String[] args) {
		

		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		
		AsteriskLogger.log("Hello Error");
		AsteriskLogger.error("Danger Will Robison");
		
		System.out.println();
		
		SpacedLogger.log("Hello Again");
		SpacedLogger.error("And Again");
		

	}

}

