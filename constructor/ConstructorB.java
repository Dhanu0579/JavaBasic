public class ConstructorB extends ConstructorA{
	
	int favNum;
	String favPlace;
	
	ConstructorB(String favPlace, int favNum){
		
		this.favNum=favNum;
		this.favPlace=favPlace;
		System.out.println("Favourite Flower is: "+favNum);
		System.out.println("Favourite Flower is: "+favPlace);
		
	}
	/*ConstructorB(int favNum,String favPlace){
		
		this.favNum=favNum;
		this.favPlace=favPlace;
		System.out.println("Favourite Flower is: "+favPlace);
		System.out.println("Favourite Flower is: "+favNum);
	}*/
	
	ConstructorB(String favfruit,String favflowers){
		System.out.println("ConstructorB started..");
		this.fruit=favfruit;
		this.flowers=favflowers;
		this.favNum=5;
		this.favPlace="Shevagv";
		System.out.println("Favourite Fruit is: "+fruit);
		System.out.println("Favourite Flower is: "+flowers);
		System.out.println("Favourite Flower is: "+favPlace);
		System.out.println("Favourite Flower is: "+favNum);
		System.out.println("ConstructorB ended..");
		System.out.println();
	}
}