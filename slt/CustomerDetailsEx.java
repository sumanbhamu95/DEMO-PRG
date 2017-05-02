package tst1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class CustomerDetailsEx {

	
	
	public static void main(String[] args) throws IOException {
		String customerId;
		String customerName;
		String gender = null;
		int age;
		String address;
		String city;
		String country;
		String pin;
		String phone;
		String areaOfInterest=null;
		String DOB;
		Scanner sc=new Scanner(System.in);
		
		//cutomer id must not b >4char and must start with 'c'
		for(int j=0;j<2;j++){
		
		System.out.println("cutomer id must not b >4char and must start with 'c'");
		customerId=sc.next();
		if((!(customerId.startsWith("c", 0)))||!(customerId.length()==4)){
			
			System.out.println("pls enter valid customer id");
			customerId=sc.next();
		}
		
		System.out.println("cutomer name should not b blank or null");
		customerName=sc.next();
		if(customerName.equals(null)){
			
			System.out.println("pls enter valid customer name");
			customerName=sc.next();
		}
		
		System.out.println("cutomer gender should only b male or female");
		gender=sc.next();
		if(!((gender.equals("male"))||(gender.equals("female")))){
			
			System.out.println("pls enter valid customer gender");
			gender=sc.next();
		}

		System.out.println("enter age");
		age=sc.nextInt();
		
		System.out.println("enter address");
		address=sc.next();
		
		System.out.println("enter city");
		city=sc.next();
		
		
		System.out.println("enter country");
		country=sc.next();
		
		System.out.println("enter pin");
		pin=sc.next();
		
		
		System.out.println("cutomer phone should allow null value if user is not entering any data");
		phone=sc.next();
		if(phone.equals(" ")){
			phone="null";
			
		}

		
		System.out.println("cutomer area of interest must enter 2 values");
		for(int i=0;i<2;i++){
		areaOfInterest=sc.next();
		}
		
		System.out.println("cutomer DOB should not b more thn 8 char");
		DOB=sc.next();
		if(DOB.length()>9){
			
			System.out.println("pls enter valid 8");
			DOB=sc.next();
		}

		File f=new File("abc.txt");
		FileWriter pw=new FileWriter(f,true);
		pw.write(customerId+","+customerName+","+gender+","+age+","+address+","+city+","+country+","+pin+","+phone+","+areaOfInterest+","+DOB);
		pw.flush();
		
		
		System.out.println(customerId+","+customerName+","+gender+","+age+","+address+","+city+","+country+","+pin+","+phone+","+areaOfInterest+","+DOB);

		System.out.println("\n");
		}
		
		//..................................................................
		
		//display total male and female customers
		
		
		
	
	
	FileReader rd=new FileReader("abc.txt");
	int sumu=0;
	int m=0;int fe=0;
	while((sumu=rd.read())!=-1){
	
	if(gender.equals("male")){
		m++;
	}
	
	else if(gender.equals("female")){
		fe++;
	}
	
	}System.out.println("total male:"+m+"..total female:"+fe);
}
}