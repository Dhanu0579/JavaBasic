public class MethodDemo{

	public void additionMethod(int a,int b)
	{
	
		int res= a+b;
		
		System.out.println(" Additon of Two number is "+res);
	
	}
	
	public static void main(String[] args)
	{
	
		System.out.println(" Method Calling !!!");
		
		MethodDemo obj= new MethodDemo();
		
		obj.additionMethod(20,30);
	
	}
}