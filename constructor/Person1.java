public class Person1 extends Person
{
	
	String job;
	int salary;
	
	Person1(String nm, int age, String job,int salary)
	{
		super(nm, age);
		this.job=job;
		this.salary=salary;
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		System.out.println(salary);
	}
	
	public static void main(String[] arg)
	{
		
		Person pr= new Person();
		Person pr1= new Person("Dhanashree", 23);
		Person pr2=new Person("D", 23, "Developer", 25000);
		Person pr3=new Person("ABC", 23, "Java Developer","TCS", 26000);
	
	}
}