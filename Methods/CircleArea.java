import java.util.Scanner;

public class CircleArea{
	
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :");
		int r=sc.nextInt();
		CircleArea ca=new CircleArea();
		
		float area=ca.CircleArea(r);
		System.out.println("Area of Circle is "+area);
	}
	
	public float CircleArea(int r){
		int radius=r;
		float ct=3.14f;
		float result=radius*ct;
		return result;
		
	}
}