import java.util.Scanner;

public class DisplayHighestSco {

	public static void main(String[] args) {
		String names[]=new String[10];
		int  marks[]=new int[10];
		
		System.out.println("enter student names");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			names[i]=sc.next();
		}
		
		System.out.println("enter student marks");
		for(int j=0;j<10;j++){
			marks[j]=sc.nextInt();
		}
			
		int max=marks[0];
		String na="";
		
		for(int x=0;x<10;x++){
			if(marks[x]>max){
				max=marks[x];
				na=names[x];
			}
		}
		System.out.println("max name and marks..:: ."+na+"    "+max);
		
		
		
	}

}
