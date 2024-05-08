package String_Class;

public class count_character {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("Ram age is 120");
		System.out.println(a);
		int upper=0,lower=0,space=0,number=0,vowel=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=97 && a.charAt(i)<=122) {
				lower++;
			}
			if(a.charAt(i)>=65 && a.charAt(i)<=90) {
				upper++;
			}
			if(a.charAt(i)>=48 && a.charAt(i)<=57) {
				number++;
			}
			if(a.charAt(i)==32) {
				space++;
			}
			if(a.charAt(i)=='A' || a.charAt(i)=='E'||a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='I'||a.charAt(i)=='a' || a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				vowel++;
			}
		}
		System.out.println("Uppercase: "+upper);
		System.out.println("Lowecase: "+lower);
		System.out.println("Space: "+space);
		System.out.println("Numbers: "+number);
		System.out.println("Vowels :"+vowel);
		System.out.println("Symbols: "+(a.length()-(upper+lower+space+number)));

	}

}
