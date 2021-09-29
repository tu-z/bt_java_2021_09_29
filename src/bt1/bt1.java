package bt1;
import java.util.Scanner;

public class bt1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		if(number >= 0) {
			if(number == 0) {
				System.out.println("Number equal than zero");
			}
			else {
				System.out.println("Number is positive");
			}
		}
		else {
			System.out.println("Number is negative");
		}
	}
}
