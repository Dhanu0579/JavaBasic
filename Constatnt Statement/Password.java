import java.util.Scanner;

public class Password{
	
	public static void validatePassword( String password){
		String pass=password;
		
		
		int length= pass.length();
		if(length>=8){
			
			//System.out.println("Password is validate !!");
			if(pass.contains ("@")|| pass.contains("$")|| pass.contains([a-z])){
		
				System.out.println("Password is validate !!");
			}
			
		}
		else{
			
				System.out.println("Please enter correct password!!");
			}
		
	}
	
	public static void main(String[] arg){
	System.out.println("Enter password ");
	Scanner sc= new Scanner(System.in);
	String password= sc.next();
	validatePassword(password);

}
	
}