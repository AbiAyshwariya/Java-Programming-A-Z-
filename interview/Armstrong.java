package JavaBase;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 Digit Number: ");
		int number=in.nextInt();
		int temp=number;
		int digit1,digit2,digit3;
		digit1=temp%10;
		temp=temp/10;
		digit2=temp%10;
		temp=temp/10;
		digit3=temp%10;
		temp=temp/10;
		int result=(digit1*digit2*digit3)+(digit1*digit2*digit3)+(digit1*digit2*digit3);
		if(result==number) {
			System.out.println(number+"is Armstrong number");
		}
		else {
			System.out.println(number+"is not a Armstrong number");
		}
		in.close();
		

	}

}
