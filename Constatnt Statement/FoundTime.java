import java.util.Scanner;

class FoundTime{
	
	public static void findTime(int time){
		
		int tm=time;
		/*if(tm>=0&&tm<12){
			
			System.out.println("It's Morning");
		}
		else if(tm>=12 && tm<16){
			
			System.out.println("It's Afternon");
		}
		else if(tm>=16 && tm<18){
			
			System.out.println("It's Evening");
		}
		else if(tm>=18 && tm<=24){
			
			System.out.println("It's night");
		}
		else{
			
			System.out.println("Please enter correct Time!!");
		}*/
		
		String res=(tm>=0&&tm<12)? "It's Morning":((tm>=12 && tm<16)?"It's Afternon" :((tm>=16 && tm<18)? "It's Evening" :((tm>=18 && tm<=24)?"It's night":"Please enter correct Time!!" )));
		System.out.println(res);
	}
	
	
	public static void main(String[] ars){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time: ");
		int time= sc.nextInt();
		findTime(time);
		
	}
}