package corejava;

public class StaticVar {
	
	String name; String address; // instance variables
	
	static String city = "Thrissur"; //class variables
	
	static int i =0; // try removing static and run  it again
	
	
	public StaticVar(String name, String address) {
		
		this.name = name; 
		this.address = address;
		
		i++;
		
		System.out.println(i);
	}
	
	public String getAddress() {
		
		System.out.println(address +" " +city);
		return address;
	}

	
	public static void getCity() {
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {

		StaticVar obj = new StaticVar("Allan", "Ollur");
		
		StaticVar obj1 = new StaticVar("Nikin", "Parme");
		
		obj.getAddress();
		obj1.getAddress();
		
		StaticVar.getCity();

	}

}
