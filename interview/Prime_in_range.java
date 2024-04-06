package JavaBase;
import java.util.Scanner;

public class Prime_in_range {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int f=0;
		for(int n=100;n<=999;n++) {
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					f++;
				}
			}
			if(f==2) {
				System.out.println("Is a prime:"+n);
			}	
		}
		f=0;
		in.close();
	}
}
