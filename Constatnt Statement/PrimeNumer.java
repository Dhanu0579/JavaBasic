import java.util.Scanner;

class PrimeNumer{
	
	public static void main(String[] agrs){
	
		System.out.println("Enter Number");
	
		Scanner sc=new Scanner(System.in);
	
		int x=sc.nextInt();
	
		for(int i=2; i<=10; i++){
			int prime=0;
			for (int j=2; j<i;j++){
				
				if(i%j==0)
				{
				 prime++;
				 break;				
				}
			}
			if(prime==0)
				System.out.println(i);
		}
	}
	
	
}
