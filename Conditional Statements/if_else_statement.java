package JavaBase;
import java.util.Scanner;
public class if_else_statement {
//Program to find the leap year
	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year");
		Scanner obj=new Scanner(System.in);
		year=obj.nextInt();
        if(year%4==0||((year%100==0)&&(year%400==0)))
        {
        	System.out.println("Year, "+year+"is a leap year");
        }
        else {
        	System.out.println("Year, "+year+" is not a leap year");
        }
        		
		obj.close();
	}

}
