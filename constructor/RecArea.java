import java.util.Scanner;

public class RecArea{
	
	int width;
	int lengh;
	
	public RecArea(int width, int lengh){
		this.width=width;
		this.lengh=lengh;
		CalArea(width, lengh);
		
	}
	
	public static void CalArea(int width, int lengh){
		
		int res=width*lengh;
		System.out.println("Reactangle Area is: "+res);
		
	}
	
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Width ");
		int width= sc.nextInt();
		
		System.out.println("Please Enter Lenght ");
		int lengh= sc.nextInt();
	
		RecArea rec= new RecArea(width, lengh);
		
	}
	
}