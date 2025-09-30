package corejava;

public class ChildSuper extends ParentSuper {
	
	String name = "AutomationLearning"; //try commenting out this line, and check output
	
	public ChildSuper() {
		
		super(); //this should be always be in 1st line of code in Child class's Constructor
		System.out.println("from ChildSuper Constructor");
	}
	
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData() {
		
		super.getData();
		System.out.println("im in child class");
	}

	public static void main(String[] args) {


		ChildSuper childSuper = new ChildSuper();
		childSuper.getStringData();
		childSuper.getData();
		
		

	}

}
