class SumOfArrayElement{
	
	public static void main(String[] arg){
		
		int[] x= {10,20,30,40};
		int sum=0;
        for (int i = 0; i < x.length; i++){
            sum += x[i];
		}
		System.out.println("Sum is: "+sum);
	}
}