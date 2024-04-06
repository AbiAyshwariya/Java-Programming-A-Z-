package JavaBase;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int t=in.nextInt();
		System.out.println("Enter the limit: ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(t+"x"+i+"="+(t*i));
		}
   in.close();
	}

}
