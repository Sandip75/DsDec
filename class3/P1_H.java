package class3;

import java.util.*;

public class P1_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int power = 1 ; 
		while(n > 0) {
			int rem = n % 2;
			ans = (rem * power ) + ans ;
			power = power * 10;
			n = n /2 ;
		}
		System.out.println(ans);
		
		// int c = 0;
		// while(n!=1) {
		// c = (10 * c) + n % 2;
		// n = n / 2;
		// }
		// if(n==1) {
		// c=c*10+n;
		// }
		// System.out.println(c);

	}

}
