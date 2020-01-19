package class4;

import java.util.*;

public class p6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 31;
		boolean flag = false;
		while (i >= 0) {
			int mask = 1 << i;
			if ((n & mask) == mask) {
				flag=true;
				System.out.print("1");
			} else if(flag) {
				System.out.print("0");
			}
			i--;
		}

	}

}
