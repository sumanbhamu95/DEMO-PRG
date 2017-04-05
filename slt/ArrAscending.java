import java.util.Scanner;

public class ArrAscending {

	public static void main(String[] args) {
		int[] a=new int[10];
		int temp=0;
		
		System.out.println("enter 10 values-no.");
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<10;x++){    //accept 10 values
			a[x]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){    // if the 1st value> 2nd value then swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.println(a[i]  +"   ");   //print ascending order
		}
		
		

	}

}
