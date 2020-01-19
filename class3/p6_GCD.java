package class3;

import java.util.*;

public class p6_GCD {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int ans = GCD(n1, n2);
		System.out.println("GCD of two number (" + n1 + "," + n2 + ") is " + ans);
	}

	public static int GCD(int n1, int n2) {
		if (n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = n1;
		}
		
		while(n2 != 0 ){
			n1 = n1 % n2 ;
			int temp = n1;
			n1 = n2 ;
			n2 = temp;
		}

		return n1;
	}

}
