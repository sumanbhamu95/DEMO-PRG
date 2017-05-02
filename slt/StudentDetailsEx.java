package tst1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//write a menu driven prgm in java to accept student details like 
//stuid,name,age,phone no.,fee status
//1.store all the data in the file
//read the details only those students whose age is>18 from the file and write the information to another file
public class StudentDetailsEx {

	public static void main(String[] args) throws IOException {
		int studentId;
		String studentName;
		int studentAge;
		int studentPhone;
		String studentFeeStatus;
		int i = 0;
		PrintWriter fw=new PrintWriter("abc1.txt");
		
		
		FileReader fr=new FileReader("abc1.txt");
		PrintWriter fw1=new PrintWriter("abc.txt");
		
		System.out.println("enter the no. 1.StudentId ,.studentName ,.StudentAge ,.studentPhone ,.feestructure and 0. exit");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		while(i!=0){
			studentId=sc.nextInt();
			fw.println(studentId);
			
			studentName=sc.next();
			fw.println(studentName);
			
			studentAge=sc.nextInt();
			fw.println(studentAge);
			
			studentPhone=sc.nextInt();
			fw.println(studentPhone);
			
			studentFeeStatus=sc.next();
			fw.println(studentFeeStatus);
			int x=0;
			
			
			
			fw.flush();
			
			//if age is greater read from abc1.txt to abc.txt
			if(studentAge>18){
				while(( x=fr.read())!=-1){
					fw1.print((char)x);
					System.out.print((char)x);
					fw1.flush();
					
				}
				
			}
			
			System.out.println(studentId);
			System.out.println(studentName);
			System.out.println(studentAge);
			System.out.println(studentPhone);
			System.out.println(studentFeeStatus);
		}

	}

}
