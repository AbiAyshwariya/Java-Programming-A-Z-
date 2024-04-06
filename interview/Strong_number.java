package JavaBase;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int num,Originalnum,rem,fact,sum=0;
			num=in.nextInt();
			Originalnum=num;
			while(num>0) {
				rem=num%10;
				fact=1;
				for(int i=1;i<=rem;i++) {
					fact=fact*i;
				}
				sum+=fact;
				num=num/10;
			}
			if(sum==Originalnum) {
				System.out.println("Strong number");
			}
			else {
				System.out.println("Not a strong number");
			}
			in.close();

		}
	
	}

