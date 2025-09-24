package corejava;


public class ArraysEx {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		int b [] ={5,4,3,2,1};
		
		a[0]=5;
		a[1]=4;
		a[2]=3;
		a[3]=2;
		a[4]=1;
		
		for(int i : b) {
			System.out.println(i);
		}
	}

}
