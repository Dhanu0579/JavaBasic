import java.util.Scanner;

public class SwapNumber{

	public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter First Number:");
	int n= sc.nextInt();
	
	System.out.println(" Enter Second Number");
	int m=sc.nextInt();
	
	n=n+m;// n=10+20=30
	m=n-m;// m=30-20=10
	n=n-m;
	
	System.out.println("After Swapping N= "+n);
	System.out.println("After Swapping M= "+m);
	
	}
	

}