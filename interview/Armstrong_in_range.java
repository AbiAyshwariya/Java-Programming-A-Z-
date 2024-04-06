package JavaBase;

import java.util.Scanner;

public class Armstrong_in_range {

	public static void main(String[] args) {
		int digit1,digit2,digit3,result,temp;
		for(int number=100;number<=99;number++) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter 3 Digit Number: ");
			number=in.nextInt();
			temp=number;
			digit1=temp%10;
			temp=temp/10;
			digit2=temp%10;
			temp=temp/10;
			digit3=temp%10;
			temp=temp/10;
			result=(digit1*digit2*digit3)+(digit1*digit2*digit3)+(digit1*digit2*digit3);
			if(result==number) {
				System.out.println(number+"is Armstrong number");
			}
			else {
				System.out.println(number+"is not a Armstrong number");
			}
			in.close();
		}

	}

}
