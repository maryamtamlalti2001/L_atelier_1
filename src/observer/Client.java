package observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new Subject(0);
	
		Observer octal = new OctalObserver(subject);
		Observer hexa = new HexaObserver(subject);
		Thread thread = new Thread(subject);
		thread.start();
		System.out.print("hey i am just adding this line i am using git ");
		
	}

}

