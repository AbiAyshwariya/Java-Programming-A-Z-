package JavaBase;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
			}
		}
		if(f==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
		in.close();


	}

}
