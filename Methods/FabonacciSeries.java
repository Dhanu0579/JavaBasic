import java.util.Scanner;

public class FabonacciSeries{
	
	public static void fabonacci(int n){
		int n1=0,n2=1,n3,i,count=n;    
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;++i){    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
	}
	
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number to find Fabonacci Series ");
		n=sc.nextInt();
		fabonacci(n);
	}
}

//i=5
//0,1,1,2,3

