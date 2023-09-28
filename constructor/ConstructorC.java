public class ConstructorC extends ConstructorB{
	
	String favSinger;
	String idol;
	
	public ConstructorC(String favfruit, String favflower, String faplace, int fanum, String favsinger, String favidol){
		super(favfruit, favflower);
		System.out.println("ConstructorC started..");
		this.fruit= favfruit;
		this.flowers= favflower;
		this.favPlace=faplace;
		this.favNum= fanum;
		this.favSinger=favsinger;
		this.idol= favidol;
		System.out.println("Favourite Fruit is: "+fruit);
		System.out.println("Favourite Flower is: "+flowers);
		System.out.println("Favourite Flower is: "+favPlace);
		System.out.println("Favourite Flower is: "+favNum);
		System.out.println("Favourite Flower is: "+favSinger);
		System.out.println("Favourite Flower is: "+idol);
		System.out.println("ConstructorC ended..");
	}
	
	public static void main(String[] arg){
		System.out.println("Main Method started..");
		//ConstructorA ca= new ConstructorA();
		//ConstructorB cb=new ConstructorB("Shevgav", 5);
		//ConstructorB cd=new ConstructorB("ABC",4);
		ConstructorC  cc= new ConstructorC("Chery", "Red Rose", "Balgram", 5, "Kim Teahyung", "V");
		System.out.println("Main method  ended..");
	}
	
}