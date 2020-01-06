package class3;
import java.util.*;

public class p4_H {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pow = 1;
		int ans =0;
		while(n>0) {
			int rem = n%10;
			ans = ans + (rem*pow);
			pow = pow * 8;
			n= n/10;
			
		}
		System.out.println(ans);
	}

}
