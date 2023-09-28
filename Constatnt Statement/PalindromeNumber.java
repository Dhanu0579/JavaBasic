import java.util.Scanner;

public class PalindromeNumber{
	
	public static void main(String[] arg){
		
		System.out.println("Please esntr number: ");
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int n=num;
		int res=0;
		
		while(num!=0){
			
			int rem=num%10;
			res=res*10+rem;
			num/=10;   // num=11/10= 1
			System.out.println(res);
		}
		System.out.println(res);
		if(n==res){
			System.out.println("Nmuber is Palindrome "+res);
		}
		else{
			
			System.out.println("Nmuber is not Palindrome");
		}
	
	}
	
}