package DsDec.class2;

import java.util.*;

public class p5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dot = n - 1;
		int star = 1;
		int i = 0;
		while (i <= (2 * (n - 1))) {
			int j = 0;
			while (j < dot) {
				System.out.print("  ");
				j++;
			}
			while (j < (dot + star)) {
				System.out.print("* ");
				j++;
			}
			if (i >= (n-1) ) {
				star -= 2;
				dot += 1;
			} else {
				star += 2;
				dot -= 1;
			}
			System.out.println();
			i++;
		}
	}

}
