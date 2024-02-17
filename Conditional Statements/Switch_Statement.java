package JavaBase;
import java.util.Scanner;
public class Switch_Statement {

	public static void main(String[] args) {
		//Simple Calculator program 
		int a,b,ch;
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice: ");
		Scanner obj=new Scanner(System.in);
		ch=obj.nextInt();
		System.out.println("Enter the value of A: ");
		a=obj.nextInt();
		System.out.println("Enter the value of B: ");
		b=obj.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("The Result of Addition: "+(a+b));
			break;
		case 2:
			System.out.println("The Result of Subtraction: "+(a-b));
			break;
		case 3:
			System.out.println("The Result of Multiplication: "+(a*b));
			break;
		case 4:
			System.out.println("The Result of Division: "+(a/b));
			break;
		default:
			System.out.println("Enter valid operation: ");
			break;
		}
		
		obj.close();
	
	}

}
