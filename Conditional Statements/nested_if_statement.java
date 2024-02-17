package JavaBase;
import java.util.Scanner;
public class nested_if_statement {
/* A insurance company insures people based on the following categories
 * 1.if the applicant is married
 * 2.If the applicant is a  unmarried male  =and above 30 years of age
 * 3.If the applicant is a unmarried female and above 25 years of age
 */
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your maritial status:");
		char maritial=obj.next().charAt(0);
		if(maritial=='u'||maritial=='U')
		{
			System.out.println("Enter your gender: ");
			char gender=obj.next().charAt(0);
			System.out.println("Enter your age:");
			int age=obj.nextInt();
			if((gender=='M'||gender=='m')&&age>30) {
				System.out.println("You are elligible for insurance");
			}
			else if((gender=='F'||gender=='f')&&age>25){
				System.out.println("You are elligible for insurance");
			}
			else {
				System.out.println("You are not elligible for insurance");
			}
			
		}
		else if(maritial=='m'||maritial=='M')
		{
			System.out.println("You are elligible for insurance");
		}
		
		else {
			System.out.println("Entered option is an invalid option");
		}
      obj.close();
	}

}
