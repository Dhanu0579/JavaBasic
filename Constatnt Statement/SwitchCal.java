import java.util.Scanner;

public class SwitchCal{
	
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		int n=sc.nextInt();
		System.out.println("Enter Second number: ");
		int m=sc.nextInt();
		System.out.println("Enter Operator(+,-,*,/): ");
		int res=0;
		
		char operator= sc.next().charAt(1);
		
		switch(operator){
			
			case '+':
				res= n+m;
				break;
			case '-':
				res= n-m;
				break;
			case '*':
				res= n+m;
				break;
			case '/':
				if(m!=0){
				res= n/m;
				}
				else{
					System.out.println("Division by zero is not possibel");
				}
				break;
		}
		System.out.println("Result is: "+res);
		
	}
	
}