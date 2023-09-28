class Split{
	
	public static void main(String[] arg){
		
		String equ="23+43-67*5";
		
		String[] equ1= equ.split("[+,*,\\-]");
		for(String equ2: equ1){
			//System.out.println(equ2);
			int num= Integer.parseInt(equ2);
			System.out.println(num);
			
		}
	}
}