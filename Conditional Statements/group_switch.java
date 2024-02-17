package JavaBase;
import java.util.Scanner;
public class group_switch {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter the character: ");
		Scanner obj=new Scanner(System.in);
		c=obj.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c+" is a Vowel");
			break;
		default:
			System.out.println(c+" is a Consonant");
			break;
		}
		obj.close();
	}

}
