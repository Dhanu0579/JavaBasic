class RemoveDupElement{
	
	public static void main(String[] args){
		
		int[] array= {10,20,30,40,20,50};
		removeDup(array);
	}
	
	public static void removeDup(int[] ar){
	
	for (int i=0; i<ar.length;i++){
		
		for(int j=1;j<i; j++){
			if(ar[i]==ar[j]){
				continue;
			}
			System.out.println(ar[j]);
		}
//System.out.println(ar[i]);
	}
	}
}