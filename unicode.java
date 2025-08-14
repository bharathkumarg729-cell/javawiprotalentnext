package javastring;

public class unicode {
	public static void main(String[] args) {
		String str = "ECEBITM";
	    System.out.println("Original String : " + str);
	    int val1 = str.codePointBefore(1);
	    int val2 = str.codePointBefore(4);
	    System.out.println("Character(unicode point) = " + val1);
	    System.out.println("Character(unicode point) = " + val2);
	}
}
