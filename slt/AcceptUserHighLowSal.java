import java.util.Scanner;

//wap to accept the name and salary of 5 employee using array variable and perform below task:
//display the name of employee who is getting paid highest
//display the name of employee who is getting paid lowest
//display the avg sal of employee

public class AcceptUserHighLowSal {

	public static void main(String[] args) {
		String b[]=new String[5];
		int a[]=new int[5];
		
		System.out.println("enter 5 names");
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<5;x++){
			b[x]=sc.next();
		}
		System.out.println("enter there sal");
		for(int y=0;y<5;y++){
			a[y]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		int sum=0;
		float avg;
		
		for(int i=0;i<5;i++){
			if(a[i]>max){
				max=a[i];
			}
			else if(a[i]<min){
				min=a[i];
			}
		}System.out.println("maxx.."+max+"    ...min...   "+min);
		
		for(int j=0;j<5;j++){
			sum=sum+a[j];
		}
		avg=sum/a.length;
		System.out.println("avg of sal..."+avg);
		

	}

}
