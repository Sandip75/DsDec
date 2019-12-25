package class1;

import java.util.*;

public class P5_check_prime_no {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				System.out.println("NOT PRIME NO");
				break;
			}
			i++;
		}
		if (i == n) {
			System.out.println("prime no");
		}
	}

}
