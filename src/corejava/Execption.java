package corejava;

public class Execption {

	static int a = 7, b = 0;

	static void getData() {

		//System.out.println(a / b);
		int[] ar = { 1, 3, 4 };
		System.out.println(ar[2]);
	}

	public static void main(String[] args) {

		try {
			Execption.getData();
		} catch (ArithmeticException e) {
			System.out.println("i catched the Arithmetic Exception error / exeception");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("i catched the Index Out Of Bounds Exception error / exeception");
		}catch (Exception e) {
			System.out.println("i catched the error / exeception");
		}
		
		finally {
			System.out.println("from finally block");
		}

	}

}
