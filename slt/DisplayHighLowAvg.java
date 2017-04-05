import java.util.Scanner;

public class DisplayHighLowAvg {

	public static void main(String[] args) {
		String b[][]=new String[5][2];
	
		
		System.out.println("enter 5 names");
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<5;x++){   //accept values from user
			for(int y=0;y<2;y++){
				b[x][y]=sc.next();
			}
			
		}
		
		for(int x=0;x<5;x++){
			System.out.println(Integer.parseInt(b[x][1])+"  ");  //display only salary
			}
		int max=Integer.parseInt(b[0][1]);
		int min=Integer.parseInt(b[0][1]);
		String names="";
		String names1="";
		int sum=0;
		float avg;
		
		for(int i=0;i<5;i++){
			if(Integer.parseInt(b[i][1])>max){   // to get the highest sal
				max=Integer.parseInt(b[i][1]);
				names=b[i][0];
				
				
			}
			else if(Integer.parseInt(b[i][1])<min){    // to get the lowest sal
				min=Integer.parseInt(b[i][1]);
				names1=b[i][0];
			}
		}System.out.println("highest paid sal...."+names+"  ...  "+max);
		System.out.println("lowest paid sal...."+names1+"  ...  "+min);
		
		for(int j=0;j<5;j++){
			sum=sum+Integer.parseInt(b[j][1]);
		}
		avg=sum/5;
		System.out.println("avg of sal..."+avg);
		

	}



}
