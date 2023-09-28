public class ConstructorA{
	
	
	String fruit;
	String flowers;
	
	public ConstructorA(){
		System.out.println("Favourite Things are: ");
		System.out.println("ConstructorA started..");
		this.fruit= "Mango";
		this.flowers= "Rose";
		System.out.println("Favourite Fruit is: "+fruit);
		System.out.println("Favourite Flower is: "+flowers);
		System.out.println("ConstructorA ended..");
		System.out.println();		
	}
	
}