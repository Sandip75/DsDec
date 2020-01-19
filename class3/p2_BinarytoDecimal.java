package class3;

import java.util.*;

public class p2_BinarytoDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0 ; 
		int power = 1 ; 
		while (n > 0) {
			int rem  = n % 10;
			ans = ans + rem * power ;
			power = power * 2 ; 
			n = n / 10;
		}
		System.out.println("Binary to decimal is " + ans);
	}

}
