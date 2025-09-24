package corejava;

public class childClassCar extends parentClass {
	
	public static void main(String[] args) {
		
		childClassCar ccrCar = new childClassCar();
		ccrCar.color();
	}

	public void engine() {

		System.out.println("engine code is implemented");

	}

	public void color() {

		System.out.println(color);
		System.out.println(color2);

	}
}
