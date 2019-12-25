package class1;

import java.util.*;

public class P4_sum_till_N {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int sum = 0;
		while (i <= n) {
			// sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
