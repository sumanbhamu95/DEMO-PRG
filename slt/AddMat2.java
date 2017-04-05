import java.util.Scanner;

public class AddMat2 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		System.out.println("enter a matrix values(3*3)");

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){    //accepting values from user
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter b matrix values(3*3)");
		
		for(int i=0;i<3;i++){    //accepting values from user
			for(int j=0;j<3;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
       System.out.println("addition of (3*3) matrix");
		
		for(int i=0;i<3;i++){    //addition 2 matrix and display
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"   ");
			}System.out.println();
		}
		
		
		
		
	}

}
