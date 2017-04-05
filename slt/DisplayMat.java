import java.util.Scanner;

public class DisplayMat {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		
		System.out.println("enter 3 * 3 matrixs values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){    //accepting values from user
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){    //displaying in 3*3 matrix form
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+"  ");
			}System.out.println();
		}
		
		
	}

}
