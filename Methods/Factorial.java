import java.util.Scanner;

public class Factorial{
	
	public int factorial(){
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter Number to Calculate Factorial: ");
		num= sc.nextInt();
		int n, fact=1;
		
		for (n=1; n<=num; n++){
			fact=fact*n;
			//System.out.println("Factorial is :"+fact);			
		}
		//System.out.println("Factorial is :"+fact);
		return fact;
	}
	
	public static void main(String[] arg){
		
		Factorial fc=new Factorial();
		
		int fact =fc.factorial();
	
		System.out.println("Factorial is :"+fact);
		/*1*1=1
		1*2=2
		2*3=6*/
	}
	
}

