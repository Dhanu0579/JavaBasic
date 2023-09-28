import java.util.Scanner;

class Square{
	
	public static void main(String[] args){
	 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter First number: ");
	int number1= sc.nextInt();
	System.out.println("Enter Sceond number: ");
	int number2= sc.nextInt();
	
	int sumOfNumber=addition(number1, number2);
	System.out.println("Sum is: "+sumOfNumber);
	
	int result=square(sumOfNumber);
	System.out.println("Square is: "+result);
	
	double root=squareRoot(sumOfNumber);
	System.out.println("SquareRoot is: "+root);
	}
	
	public static int addition(int number1, int number2){
		
		int sum= number1+number2;
		return sum;
	}
	
	public static int square(int seq){
		
		int square= seq*seq;
		return square;
		
	}
	
	public static double squareRoot(int seqR){
		//sqrtn+1=(sqrtn+(num/sqrtn))/2.0
		double seqRoot= seqR/2;
		double temp;
		
		do{  
			temp=seqRoot;  
			seqRoot=(temp+(seqR/temp))/2;  
		} while((temp-seqRoot)!= 0);
		return seqRoot;
		
	}
}