package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBase {
	
	public static void main(String[] args) {
	
	
	
	
	// askhow mant stuent added
	System.out.println("Enter number of student to enroll : ");
	Scanner in = new Scanner(System.in);
	
	int noOfStudent = in.nextInt();
	
	Student[] students = new Student[noOfStudent];
	
	for(int i=0; i< noOfStudent ; i++) {
		
		students [i]= new Student();
		students [i]. enroll();
		students [i].payTution();
		
		System.out.println(students [i].showInfo());
		
	}
	
	
	
	
	

}
}