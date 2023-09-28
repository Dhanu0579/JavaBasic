import java.util.Scanner;

public class GreaterNumber{
	
	public static void main(String[] arg){
	
		System.out.println("Enter First number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Second number");
		int n1=sc.nextInt();
		System.out.println("Enter Third number");
		int n2=sc.nextInt();
		GreaterNumber gr=new GreaterNumber();
		int result=gr.GreaterNumber(n,n1,n2);
		System.out.println("Greater Number is: "+result);
	}
	public int GreaterNumber(int n,int n1,int n2){
			
			int m=n;
			int m1=n1;
			int m2=n2;
			if(m>m1){
				
				return m;
			}
			else if(m1>m2){
				return m1;
			}
			else{
				return m2;
			}
		}
	
}