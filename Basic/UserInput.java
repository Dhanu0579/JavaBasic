import java.util.Scanner;

public class UserInput{

	public static void addition(int a, int b){
		
		int res= a+b;
		
		System.out.println("Addition of two numbers :" +res);	
		
	}
	
	public static void subtraction(int a, int b){
		
		int res= a-b;
		
		System.out.println("Subtractio of two numbers :" +res);
		
		
	}
	
	public static void multipication(int a, int b){
		
		int res= a*b;
		
		System.out.println("Multipication of two numbers :" +res);
		
		
	}
	
	public static void divison(int a, int b){
		
		int res= a/b;
		
		System.out.println("Division of two numbers :" +res);
		
		
	}
	
	
	
	public static void main( String[] args){
		
		System.out.println("Enter two numbers :");
		
		Scanner sc= new Scanner(System.in);
		
		//Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter First numbers :");
		int n= sc.nextInt();
		
		System.out.println("Enter second numbers :");
		int m= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your choice : ADD, SUB, MUL, DIV");
		
		String choice= sc.nextLine();
		
		if(choice.equalsIgnoreCase("ADD")){
			
			addition(n, m);
		}
		
		
		else if(choice.equalsIgnoreCase("sub")){
			
			subtraction(n, m);
		}
	
		else if(choice.equalsIgnoreCase("mul")){
			
			multipication(n, m);
		}
		else if(choice.equalsIgnoreCase("div")){
			
			divison(n, m);
		}
		else{
			
			System.out.println(" Choice can't be blank !");
		}
	}

}
