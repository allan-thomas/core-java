package corejava;

import org.testng.annotations.BeforeMethod;

public class PS {
	
	public static void doThis() {
		System.out.println("I'm here");
	}
	
	@BeforeMethod
	public static void BeforeRun() {
		System.out.println("I run first as im inherited from PS to PS1");
	}

}
