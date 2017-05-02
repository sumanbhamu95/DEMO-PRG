package tst1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentExamSlt1 {

	
	
	public static void main(String[] args) throws IOException {
		int studentId;
		String studentName;
		int studentAge;
		int studentPhone;
		int studentFeeStatus;
		int i;
		PrintWriter fw=new PrintWriter("abc.txt");
		
		System.out.println("enter the no. 1.StudentId \n 2.studentName \n 3.StudentAge \n 4.studentAge \n 5.feestructure");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		switch(i){
		
		case 1:System.out.println("enter id");
			studentId=sc.nextInt();
			fw.write(studentId);
			System.out.println(studentId);
		break;
		case 2:System.out.println("enter name");
		studentName=sc.next();
		fw.write(studentName);
		System.out.println(studentName);
		break;
		case 3:System.out.println("enter age");
		studentAge=sc.nextInt();
		fw.write(studentAge);
		System.out.println(studentAge);
		break;
		case 4:System.out.println("enter no..");
		studentPhone=sc.nextInt();
		fw.write(studentPhone);
		System.out.println(studentPhone);
		break;
		case 5:System.out.println("enter fee status");
		studentFeeStatus=sc.nextInt();
		fw.write(studentFeeStatus);
		System.out.println(studentFeeStatus);
		break;
		default:System.out.println("not a valid no. check menu");
		
		}
		
		

	}

}
