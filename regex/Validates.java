import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Validates{
	
   public static String validate(String text)
   {
	  // Pattern pattern = Pattern.compile("^[0-9][\\w]*$");
	   Pattern pattern = Pattern.compile("^[,0]$");
	   Matcher m = pattern.matcher(text);
		/*int count =0;
		
		if(m.find() && m.group().equals(text)){
			count++;
		}
		System.out.println(count);*/

	
        if (m.find() && m.group().equals(text))
		   return "True";
	    else
		   return "False";
   }
		
	
	public static void main(String[] arg) 
	{
		/*System.out.println("Enter Password : ");
		String password = scan.nextLine();	
		System.out.println(passValidation(password));*/

		//System.out.println(validate("1dhanHshri123"));	
		System.out.println(validate("234.06.087"));	
	 
	}
}
