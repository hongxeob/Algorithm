import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(gcd(num1, num2));
		System.out.println(lcm(num1, num2));

	}

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
