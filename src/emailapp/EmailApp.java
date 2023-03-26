package emailapp;

public class EmailApp {
	
	public static void main(String[] args) {
		
		Email mail = new Email("Ankush", "Singhal");
		
		System.out.println(mail.showInfo());
		
		Email mail1 = new Email("Rahul", "Singhal");
		
		System.out.println(mail1.showInfo());
		
		
		
	}

}
