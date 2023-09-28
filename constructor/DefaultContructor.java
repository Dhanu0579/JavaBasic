public class DefaultContructor{
	
	int roll; //instance variable
	String name;//instance variable
	
	public static void main(String[] arg){
		
		DefaultContructor s1= new DefaultContructor();
		
		s1.roll=30;// to access instance variable we user obj name here obj is s1
		s1.name="Dhanashri";
		System.out.println("Roll Number is "+s1.roll);
		System.out.println("Name is "+s1.name);
		
	}
}