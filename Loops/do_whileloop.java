package JavaBase;
import java.util.Scanner;
public class do_whileloop {
     public static void main(String args[])
     {
    	 System.out.println("Enter the limit: ");
    	 Scanner obj=new Scanner(System.in);
    	 int n=obj.nextInt();
    	 int i=1;
    	 do {
    		 System.out.println(i);
    		 i=i+1;
    	 }while(i<=n);
    	 obj.close();
     }
}
