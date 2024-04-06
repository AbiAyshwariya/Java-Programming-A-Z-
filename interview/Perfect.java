package JavaBase;
import java.util.Scanner;

public class Perfect {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		int sum=0;
		for(int i=11;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a Perfect number");
		}
		in.close();
	}

}
