package corejava;


public class PS2 extends PS3 {

	int a;
	public PS2(int a) {
		
		super(a); // invokes the constructor of the parent class
		this.a = a;

	}
	
	public int incre()
	{
		a++;
		return a;
	}
	
	public int decre()
	{
		a--;
		return a;
	}

}
