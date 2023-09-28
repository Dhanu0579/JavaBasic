public class SumOfEvenNum{
	
	public static void main(String[] arg){
		int sum=0;
		for(int i=2; i<=50; i++){
			
			if(i%2==0){
				System.out.println("even number is :"+i);
				sum=sum+i;
				System.out.println("Sum of even number is :"+sum);
			}
			//sum+=i;
		}
		//System.out.println("Sum of even number is :"+sum);
	}
}