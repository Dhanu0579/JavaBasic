import java.util.Scanner;

public class Ternary{
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check positive or not: ");
		int num= sc.nextInt(); 
		
		String result= (num>0) ? "Positive" : "Negative";
		System.out.println(result);
		
		int n=12, n1=4, n2=5;
		int res= (n>n1) ? ((n>n2) ? n:n1) : ((n1>n2) ? n1 :n2);  //12>4, 12>5
		
		//int res = (n > n1) ? ((n > n2) ? n:n2)
		
		System.out.println( "Largest Number: "+res);
	}
	
}