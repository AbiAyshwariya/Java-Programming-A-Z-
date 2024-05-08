package array;
import java.util.Scanner;
public class Even_and_Odd_countArray {

	public static void main(String[] args) {
		int e=0,o=0;
		System.out.println("Enter the limit: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++) {
			System.out.println("Enter a["+i+"]");
			a[i]=in.nextInt();
		}
		for(int element:a) {
			if(element%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("Number of odd numbers: "+o);
		System.out.println("Number of even numbers: "+e);
        in.close(); 
	}

}
