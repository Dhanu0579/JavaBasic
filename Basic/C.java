public class C extends B{

//int C;

String state;


public C(int c, String city, int a, String name,String state){
	super(c,city,a,name);
	//this();
	this.state=state;
	//super.m1();
System.out.println("This is  All arg Constructor of class C");
}
public C(){
	//super();
System.out.println("This is No Arg Constructor of class C");
this.m1();
//super.m1();
}
public static void main(String [] args){
 
  C object = new C();
 C object1 = new C(10,"pune",20,"viki","MH");
 //  System.out.println("Value of C "+object1.C);
  //  System.out.println("Value of name "+object1.state);
	//object.m1();
}
public void m1(){
	System.out.println("This is a Class C method");
}
}