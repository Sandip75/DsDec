package class3;

import java.util.*;

public class p5_AnyBasetoAnyBase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int inputBase = s.nextInt();
		int outputBase = s.nextInt();

		int power = 1;
		int ans = 0;
		while (n > 0) {
			int rem = n %  outputBase;
			ans = ans + (rem * power);
			power = power * inputBase ;
			n = n / outputBase;
		}
		System.out.println("Base" + inputBase + " conver to base" + outputBase + " == " + ans);
	}

}
