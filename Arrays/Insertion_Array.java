package array;

import java.util.Arrays;

public class Insertion_Array {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int index=2;
		int value=55;
		System.out.println("Before Insertion: "+Arrays.toString(a));
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
        a[index]=value;
        System.out.println("After Insertion: "+Arrays.toString(a));
	}

}
