package class2;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int i = 0;
		while (i < n) {
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			star += 1;
			System.out.println();
			i++;
		}
	}
}
