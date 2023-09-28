import java.util.Scanner;

public class MultiplicationTable{
	
	public static void multiplication(int n){
			int num=n;
		for(int i=1; i<=10; i++){
			int res=num*i; // 2*1
			System.out.println(+num+"*"+i+"="+res);
		}
	}

public static void main(String[] arg){
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter to to calculate multiplicatin table: ");
	int n=sc.nextInt();
	
	multiplication(n);
	
}	
	
}