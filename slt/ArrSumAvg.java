import java.util.Scanner;

public class ArrSumAvg {

	public static void main(String[] args) {
		int a[]=new int[10];
		int sum=0,avg=0;
		
		System.out.println("enter 10 values");
		Scanner sc=new Scanner(System.in);
		
		//accept 10 values
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		
		//cal sum
		for(int x=0;x<10;x++){
			sum=sum+a[x];
		}
		System.out.println("sum is.."+sum);
		
		//cal avg
		avg=sum/a.length;
		System.out.println("average is.."+avg);

	}

}
