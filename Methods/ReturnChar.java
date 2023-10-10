/*Two inputs i.e. (string, boolean value). Ask user to input string and check If boolean value set to TRUE, return a string length 1 from its beginning,
if its set to FALSE, return a string length 1 from its end.

Note : The string will be non-empty.

Ex1:("Hello", true) → "H"

Ex2:("Hello", false) → "o"*/

import java.util.Scanner;

public class ReturnChar{
	
	public static void returnChar(String string){
		Scanner scc= new Scanner(System.in);
		System.out.println("Please enter 1 or 0");
		int number= scc.nextInt();
		String str=string;
		if(number==1){
			
			char result= str.charAt(0);
			System.out.println(result);
		}
		else if(number==0){
			char secResult= str.charAt(str.length()-1);
			System.out.println(secResult);
		}
		else{
			System.out.println("Please Enter number between 1 and 0");
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter String");
		String string= sc.next();
		returnChar(string);
		
	}
}