import java.util.Scanner;

public class Calculator{
	
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter to Calculate");
		String equ= sc.next();
		
		const break=/+|-|*|/;
		
		String[] words=equ.split(break); //splits the string based on whitespace using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
	}
	
}