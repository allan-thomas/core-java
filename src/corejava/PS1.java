package corejava;

import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void TestRun() {
		
		doThis();
		int a= 2;
		PS2 ps2 = new PS2(a); // Parameterized constructor
		System.out.println(ps2.incre());
		System.out.println(ps2.decre());
		System.out.println(ps2.multiBytwo());
		System.out.println(ps2.multiByThree());
	}

}
