import java.util.Scanner;

class SearchElement{
	
	public static void main(String[] args){
		
		int[] x={10,20,40,50};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check :");
		int n=sc.nextInt();
		findArrayElement(x, n);
		
	}
	
	public static void findArrayElement(int[] y, int num){
		int ns=num;
		int flag = 0;
		for(int i=1; i< y.length; i++){
			
			if(y[i]==ns){
			 System.out.println("Number is present in array "+y[i]);
			 flag = 0;
			 break;
			}
			else{
				flag = 1;
			}
		}
		if (flag == 1){
			System.out.println("Number is not present");
		}
		
	}
}