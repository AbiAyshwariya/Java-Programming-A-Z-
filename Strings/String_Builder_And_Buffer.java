package String_Class;

public class String_Builder_And_Buffer {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Ayshu");
		System.out.println(buffer);
		buffer.append("Riya");
		System.out.println(buffer);
		StringBuilder buffer1=new StringBuilder("Ayshu");
		buffer1.insert(5,"Computer");
		System.out.println(buffer1);
		buffer1.replace(9,11,"@@@");
		System.out.println(buffer1);
		buffer1.delete(9,11);
		System.out.println(buffer1);
		buffer1.reverse();
		System.out.println(buffer1);
		System.out.println(buffer1.charAt(2));
		System.out.println(buffer1.length());
		System.out.println(buffer1.substring(0));
		System.out.println(buffer1.substring(0,5));
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		

	}

}
