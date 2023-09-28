public class PersonsInformation{
	
	
	public void display() {
		System.out.println("This is a final method.");
	}
}

// try to extend the final class

class Main extends PersonsInformation {
	public  void display() {
		System.out.println("The final method is overridden.");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
  }
}

