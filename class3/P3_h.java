package class3;

import java.util.*;

public class P3_h {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pow = 1;
		while (n > 0) {
			int rem = n % 8;
			ans = (rem * pow) + ans;
			pow = pow * 10;
			n = n / 8;

		}
		System.out.println(ans);

	}

}
