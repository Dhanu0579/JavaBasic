import java.util.Scanner;

public class Block{
	static{
		System.out.println("Hello I am your Guide- D");
		System.out.println("What's your name?");
		
	}

	public static void name(String na)
	{
		String names=na;
		Scanner sc1= new Scanner(System.in);
		//System.out.println("Hello D, My name is "+names);

		System.out.println("Hello "+names);
		
		System.out.println("Did you want to calculate some thing");
		
		String choice= sc1.next();
		
		if(choice.equalsIgnoreCase("Yes")){
			
			calculate();
		}
		else{
			
			System.out.println("Thanks for the Responce!!"); 
		}
	}
	
	public static void calculate(){
		
		System.out.println("Enter two numbers :");
		
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("Enter First numbers :");
		int n= sc1.nextInt();
		
		System.out.println("Enter second numbers :");
		int m= sc1.nextInt();
		 
		
		
		System.out.println("Enter your choice : ADD, SUB, MUL, DIV");
		
		String choice= sc1.next();
		
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
	
	public static void main(String[] arg){
		Scanner sc=new Scanner( System.in);
		String name= sc.next();
		name(name);
		
		
	}
}

//4-67+56...n