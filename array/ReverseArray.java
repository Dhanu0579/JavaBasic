class ReverseArray{
	
	public static void main(String[] args){
		
		int[] array= {10,20,30,40};
		reverseArray(array);
	}
	
	public static void reverseArray(int[] ar){
		//int num=ar[0];
		for(int i=ar.length-1; i>=0; i--){

				System.out.print( ar[i]+" ");		
		}
		
	}
}