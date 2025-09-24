package corejava;

public class ConstructorDemo {

	public ConstructorDemo() {
		// all code inside this would get executed once when an object of the class is created :)
		
		System.out.println("im running from Constructor");
	}
	
	public void getData() {
		
		System.out.println("im running from getdata");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo cDemo = new ConstructorDemo(); // line 8 would run as soon as we declare the object.
		
		cDemo.getData();
		

	}

}
