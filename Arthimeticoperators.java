package Assessment;
import java.util.Scanner;

public class Arthimeticoperators {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("a:");
		int a = scanner.nextInt();
		System.out.print("b:");
		int b = scanner.nextInt();
		scanner.close();
		System.out.println("addition=" + (a + b));
		System.out.println("substraction=" + (a - b));
		System.out.println("Multiplication=" + (a * b));
		System.out.println("Division=" + (a / b));
	}

}
