import java.util.Scanner;

public class PositiveNegative{
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(n>0){
			
			System.out.println(+n+" is positive number");
		}
		else if(n<0){
			
			System.out.println(+n+" is negative number");
		}
		else{
			
			System.out.println("Number is Zero");
		}
		
	}
	
}