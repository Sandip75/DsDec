package class3;
import java.util.*;

public class p4_OctaltoDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0 ; 
		int power = 1;
		while(n > 0){
			int rem = n % 10;
			ans = ans + rem * power ;
			power = power * 8;
			n = n / 10;
		}
		System.out.println("Octal to decimal is " + ans);
	}

}
