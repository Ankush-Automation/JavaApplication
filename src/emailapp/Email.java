package emailapp;

import java.util.Scanner;

public class Email {

	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String alteranateMail;
	private int mailBoxCapacity =100;
	private String companySuffix = "testingminds.com";

	// constructor to receive fn and ln
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	//	System.out.println("Email Created : " + this.firstName + " " + this.lastName);

		// call the deptname
		this.department = setDepartment();
		System.out.println("Department code is " + this.department);

		// call a password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);

		// combine element to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		// System.out.println("Your email is : " + email);

	}

	// Ask for the department
	private String setDepartment() {
		System.out.print(
				"New Worker: "+firstName+". Department Codes:\n1 for sales\n2 for Developemnt \n3 for Account\n0 for none \nEnter the dept Code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "Developemnt";
		} else if (depChoice == 3) {
			return "account";
		} else {
			return "none";
		}

	}

	// genearete the random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());

			password[i] = passwordSet.charAt(random);
		}
		return new String(password);

	}

	// set the mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// set the alternat email
	public void setAlternateEmail(String altEmail) {
		this.alteranateMail = altEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alteranateMail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
			return ("DISPLAYNAME :" + firstName +lastName + "\nCOMPANY EMAIL : " + email + "\nMAILBOX CAPACITY : " + mailBoxCapacity + " mb");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
