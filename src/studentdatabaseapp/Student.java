package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String student;
	private String firstName;
	private String lastName;
	private String courses="";
	private int tuitionBalance = 0;
	private String studentId;
	private int gradeYear;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// contructor : promt user to enter student name & year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Name :");
		this.firstName = in.nextLine();

		System.out.print("Enter the Last Name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Fresher\n2 - Sophmore\n3 - Junior\n4 - Senior \nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		// System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);

	}

	// generate an id
	private void setStudentID() {

		// Grade level + id
		id++;
		this.studentId = gradeYear + "" + id;

	}

	// enroll in course
	public void enroll() {

		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				// System.out.println("BREAK!");
				break;
			}
		} while (1 != 0);

		// System.out.println("ENROLLED IN : "+ courses);
		// System.out.println("TUITION BALANCE : $"+ tuitionBalance);

	}

	// view balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
	}

	// pay tuitaion
	public void payTution() {
		viewBalance();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your payment : ");
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks you for your payment of $" + payment);
		viewBalance();

	}

	// show status
	public String showInfo() {
		return "Name : " + firstName + " " + lastName +"\nGradeLevel:"+gradeYear+ "\nStudent ID : "+ studentId +"\nCourses Enrolled: " + courses + "\nBalance :$"
				+ tuitionBalance;
	}

}
