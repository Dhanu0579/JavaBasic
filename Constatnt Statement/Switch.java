import java.util.Scanner;

public class Switch{
	
	public static void main(String[] arg){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		
		int res=n%2;
		
		switch(res){
		
			case 0:
				System.out.println(+n+" is even number");
				break;
			default:
				System.out.println(+n+" is odd number");
				break;
		}
		
		}
}