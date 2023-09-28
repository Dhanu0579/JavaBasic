public class StudentInfo extends Student{
	
	int roll;
	String place;
	String college;
	
	StudentInfo(){
		
		//super();
		this.roll=24;
		this.place="Kolhapur";
		System.out.println("Below is the my some information");
		System.out.println("My Roll Number is "+roll+" and from "+place);		
				
	}
	
	StudentInfo(String clg){
		this();
		this.college =clg;
		System.out.println(" I'm graduate from "+college);
		System.out.println("Thanks You!! Have a grate day");	
	}
	
	public static void main(String[] arg){
		String clg ="Sanjeevn Engineering and Technology";
		StudentInfo s1=new StudentInfo();
		StudentInfo s2=new StudentInfo(clg);
	
	}
}