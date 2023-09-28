public class PersonInformation{
	
		String na;
		int ag;
		String ge;
		
		public PersonInformation(String name, int age, String gender){
		
			this.na= name;
			this.ag=age;
			this.ge=gender;
			displayDetails(na, ag,ge);
			
		}
		
		protected static final void displayDetails(String na, int ag, String gr){
			
			String nav=na;
			int vay= ag;
			String ge=gr;
			System.out.println("Name is "+nav);
			System.out.println("Age is "+vay);
			System.out.println("Gender is "+gr);
			
		}
	public static void main(String[] arg){
		
		String name;
		int age;
		String gender;
		PersonInformation pi=new PersonInformation("Dhanashri", 23, "Female");
		
	}
}