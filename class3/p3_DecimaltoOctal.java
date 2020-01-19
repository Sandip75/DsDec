package class3;

import java.util.*;

public class p3_DecimaltoOctal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int power = 1;
		while (n > 0) {
			int rem = n % 8;
			ans = ans + (power * rem);
			power = power * 10;
			n = n / 8;
		}
		System.out.println("Decimal to octal " + ans);
	}
}
