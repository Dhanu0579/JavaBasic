class MinArrayNumber{
	
	public static void main(String[] args){
		
		int[] numbers= {23,7,76,6,4,29};
		
		int minNumber= (findMinNumber(numbers));
		System.out.println("Minimum Number is: "+minNumber);
		
	}
	
	
	public static int findMinNumber(int[] ar){
		
		if(ar.length==0){
			System.out.println("Array is Empty");
		}
		int min=ar[0];
		for(int i=1; i<ar.length;i++){
			
			if(ar[i]< min)
			{
				min=ar[i];
			}
		}
		return min;
	}
}