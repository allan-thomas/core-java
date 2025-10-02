package corejava;

import java.util.ArrayList;

public class UniquieNumberPGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 },count;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		
		for (int i =0;i<a.length;i++) {
			if(!al.contains(a[i])) {
				
				count=0;
				al.add(a[i]);
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j])
						count++;	
				}
				System.out.println("the number "+a[i]+" is repeated "+(count+1)+ "times");
				if(count==0)
					System.out.println("the number "+a[i]+" is my Unique number which is seen only "+(count+1)+ "time");
				
			}
			
			
		}
		
	}

}
