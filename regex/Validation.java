import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	static Scanner scan = new Scanner(System.in);
	
	
	public static boolean passValidation(String pass) {

	 
		 
		 String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-_+=()])(?=\\S+$).{8,20}$";


	     Pattern p = Pattern.compile(regex);

	     if (pass == null) {
	         return false;
	     }


	     Matcher m = p.matcher(pass);

	     return m.matches();
		
	}
	
	public static void main(String args[]) {
		System.out.println("Enter Password : ");
		String password = scan.nextLine();	
		System.out.println(passValidation(password));		
	}

}