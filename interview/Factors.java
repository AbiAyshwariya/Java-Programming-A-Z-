package JavaBase;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+"");
			}
		}
		in.close();

	}

}