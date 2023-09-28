class ArrayTest{
	
	public static void main(String[] args){
		
		//int[] a= new int[2147483647]; // array creation of int type.
		//int[] a= new int[2]; // array creation of int type.
		//System.out.println("Below is the arry class: ");
		//System.out.println(a.getClass().getName());
		//System.out.println(a);
		
		//boolean[][] b= new boolean[3][2]; // 2D array creation of boolean type.
		//System.out.println(b.getClass().getName());
		
		//byte[][] by= new byte[3][2]; //2D array creation creation of byte type.
		//System.out.println(by.getClass().getName());
		
		// Array initialization.
		
		/*int [] x= new int[3];
		System.out.println(x);
		System.out.println(x[0]);*/
		
		/*int[][][] x= new int[2][3][1];
		System.out.println(x);
		System.out.println(x[0][0]);
		System.out.println(x[0][0][0]);*/
		
		int[] a={10,20,30,40,50,60};
		int[] b={70,80};
		int[] c=a;
		a=b;
		b=c;
		System.out.println(b[3]);
	
	}
}