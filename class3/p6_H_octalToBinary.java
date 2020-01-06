package class3;

import java.util.*;

public class p6_H_octalToBinary {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int ans = 0;
	int pow = 1;while(n>0)
	{
		int rem = n % 10;
		ans = ans + (binary(rem) * pow);
		pow = pow * 10;
		n = n / 10;
	}System.out.println(ans);
	}

public static int binary(int a) {
	int ans = 0;
	int pow = 1;
	while(a>0) {
		int rem = a%2;
		ans = ans + (rem*pow);
		pow = pow*10;
		a= a / 2;
		
	}
	System.out.println(ans);
	return(ans);
}
}
