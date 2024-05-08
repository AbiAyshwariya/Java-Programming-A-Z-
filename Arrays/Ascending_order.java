package array;
import java.util.*;

public class Ascending_order {

	public static void main(String[] args) {
		int []a=new int[]{8,2,9,7,33,3,8};
		System.out.println("Before Sort:");
		for(int element:a) {
			System.out.println(element);
		}
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Sort: "+Arrays.toString(a));
		
		
		

	}

}
