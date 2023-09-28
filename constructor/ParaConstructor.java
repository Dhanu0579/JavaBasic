public class ParaConstructor{
	
	int roll;
	String name;
	String address;	
	
	public ParaConstructor(int rn, String name, String add){
		
		this.roll=rn;
		this.name=name;
		this.address=add;
		System.out.println("Roll number is "+roll);
		System.out.println("Roll number is "+name);
		System.out.println("Roll number is "+address);
	
	}
	
	public static void main(String[] arg){
		
		ParaConstructor para=new ParaConstructor(10, "Dhanashri", "Pune");
		
		/*System.out.println("Roll number is "+para.roll);
		System.out.println("Roll number is "+para.name);
		System.out.println("Roll number is "+para.address);	*/
		
	}
}