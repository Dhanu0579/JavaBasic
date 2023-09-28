import java.util.Scanner;

public class FactorialDemo{
	
	public static int factorial(int num){
		int i=num;
		int n, fact=1;
		for (n=1; n<=i; n++){
			
			fact=fact*n;		
		}
		
		return fact;
	}
	
	public static void main(String[] arg){
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number to Calculate Factorial: ");
		num= sc.nextInt();
		int result=factorial(num);
		System.out.println("Factorial is :"+result);
		
	}
	
}

