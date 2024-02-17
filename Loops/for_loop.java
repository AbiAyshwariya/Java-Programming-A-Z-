package JavaBase;
import java.util.Scanner;
public class for_loop {

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.println(i);
		}
		obj.close();

	}

}
