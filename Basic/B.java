public class B extends A{

int b;

String city;


public B(int b, String city, int a, String name){
	super(a,name);
	this.b=b;
	this.city=city;
System.out.println("This is  All arg Constructor of class B");
 //  System.out.println("Value of B "+b);
 //   System.out.println("Value of name "+city);
}
public B(){
	super();
System.out.println("This is No Arg Constructor of class B");
//this.m1();
}
public static void main(String [] args){
 
  B object = new B();
  
  B object1 = new B(10,"pune",20,"viki");
   //System.out.println("Value of B "+object1.b);
   // System.out.println("Value of name "+object1.city);
	//object1.m1();
}
public void m1(){
	//super.m1();
	System.out.println("This is a Class B method");
}
}