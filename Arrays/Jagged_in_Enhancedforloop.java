package array;

public class Jagged_in_Enhancedforloop {

	public static void main(String[] args) {
			int a[][]= {{10,20,30,30},{10,20,30},{10,20,30,50}};
			for(int k[]:a) {
				for(int i:k) {
					System.out.print(" "+i);
				}
				System.out.println(" ");
			}
				

	}

}
