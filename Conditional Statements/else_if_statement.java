package JavaBase;
import java.util.Scanner;
public class else_if_statement {

	public static void main(String[] args) {
	/*Else if Ladder Sample 
	 * 90-100   GradeA
	 * 80-89    GradeB
	 * 70-79    GradeC
	 * 60-69    GradeD
	 * <60      GradeE
	 */
		
		float avg;
		System.out.println("Enter your average mark: ");
		Scanner in=new Scanner(System.in);
		avg=in.nextInt();
		if(avg>=90 && avg <=100) {
			System.out.println("Your Grade is A");
		}
		else if(avg>=80 && avg<=89) {
			System.out.println("Your Grade is B");
		}
		else if(avg>=70 && avg<=79) {
			System.out.println("Your Grade is C");
		}
		else if(avg>=60 && avg<=69) {
			System.out.println("Your Grade is D");
		}
		else{
			System.out.println("Your Grade is E.");
		}
        in.close();
	}

}
