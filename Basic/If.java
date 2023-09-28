import java.util.Scanner;

public class If{
	
	public static void main(String[] arg){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Number");
		int number= sc.nextInt();
		
		
		if(number%2==0){
			
			System.out.println("Number "+number+" is even number");
		}
		else{
			
			System.out.println("Number "+number+" is not even number");
		}
		
		System.out.println(" USing Ternary Operator");
		
		String result;
		
		result=(number%2==0)? "Even Number": "Not even number";
		
		System.out.println(result);
	}
	
}