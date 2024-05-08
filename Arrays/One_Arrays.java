package array;

public class One_Arrays {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		System.out.println(a[1]);
		System.out.println(a[2]);
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		for(int element:a) {
			System.out.println(element);
		}
		int b[]= {1,12,33,44,56,77,89};

		for(int element:b) {
			System.out.println("Elements are: "+element);
		}
	}
	
}
