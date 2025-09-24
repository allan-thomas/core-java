package corejava;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int i;

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };

		int smallestNumber = a[0][0], smallestColumnNumber = 0;
		int largestNumber = a[0][0];

		for (i = 0; i < 3; i++) // for row
			for (int j = 0; j < 3; j++) { // for column
				if (a[i][j] < smallestNumber) {
					smallestNumber = a[i][j];
					smallestColumnNumber = i;
				}
				if (a[i][j] > largestNumber) {
					largestNumber = a[i][j];

				}
			}

		System.out.println("the smallest number in the matrix is = " +smallestNumber);

		// to print the largest number in the selected coloumn
		
		System.out.println(i);

		i=0;
		int largestNumberInTheSelctedColmn = a[0][smallestColumnNumber];
		while (i < 3) {
			if (a[i][smallestColumnNumber] > largestNumberInTheSelctedColmn)
				largestNumberInTheSelctedColmn = a[i][smallestColumnNumber];
			i++;
		}

		System.out.println("the largest number in the selcted column is =  " +largestNumberInTheSelctedColmn);

	}
}
