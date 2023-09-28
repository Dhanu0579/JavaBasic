public class A{

int a;

String name;


public A(){
	//super();
System.out.println("This is No Arg Constructor of class A");
}

public A(int a, String name){
	this.a=a;
	this.name=name;
System.out.println("This is  All arg Constructor of class A");
//System.out.println("Value of a "+a);
//System.out.println("Value of name "+name);
//m1();
}

public static void main(String [] args){
 
  A object = new A();
  
  A object1 = new A(10,"viki");
 //  System.out.println("Value of a "+object1.a);
 //   System.out.println("Value of name "+object1.name);
	
}

public void m1(){
	System.out.println("This is a Class A method");
}

}