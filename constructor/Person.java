public class Person
{
	
	String name;
	int age;
	String job;
	int salary;
	String comp;
	
	Person()
	{
		
		this.name= "Dhanu";
		this.age=25;
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public Person(String name, int age)
	{
		
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	Person(String nm, int age, String job,int salary)
	{
		this.name=name;
		this.age=age;
		this.job=job;
		this.salary=salary;
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		System.out.println(salary);
	}
	
	public Person(String name, int age, String job, String comp, int salary	){
		
		this.name=name;
		this.age=age;
		this.job=job;
		this.comp=comp;
		this.salary=salary;
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		System.out.println(comp);
		System.out.println(salary);
	}
	
	/*public static void main(String[] arg){
		
		Person pr= new Person();// default Constructor.
		System.out.println("Name is "+pr.name);
		System.out.println("Name is "+pr.age);
		Person pr1=new Person("Dhanashri", 24);
	}*/
}