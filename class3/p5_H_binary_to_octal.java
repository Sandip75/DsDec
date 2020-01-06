package class3;
import java.util.*;

public class p5_H_binary_to_octal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pow = 1;
		while(n>0) {
			int rem = n%1000;
			ans = ans + (octal(rem)*pow);
			pow = pow * 10;
			n = n/1000;
			
		}
		System.out.println(ans);

	}
	public static int octal(int a) {
		int ans = 0;
		int pow = 1;
		while(a>0) {
			int rem = a%2;
			ans = ans +(rem*pow);
			pow = pow * 2;
			a = a / 10;
		}
		return(ans);
	}

}
