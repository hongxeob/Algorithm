import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = a; i <= b; i++) {
			boolean prime = false;
			prime = isPrime(i);
			if (prime) {
				list.add(i);
				sum += i;
			}
		}
        
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
