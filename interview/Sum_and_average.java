package JavaBase;
import java.util.Scanner;

public class Sum_and_average {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the number: ");
			int a =in.nextInt();
			sum+=a;
		}
		System.out.println("Sum of"+n+"is:"+sum);
		System.out.println("Average of"+n+"numbers is:"+sum/n);
		in.close();

	}

}
