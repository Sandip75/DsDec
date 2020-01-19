package class3;
import java.util.*;

public class p1_DecimaltoBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0 ; 
		int power = 1; 
		while(n > 0 ){
			int rem =  n % 2 ;
			ans = rem * power + ans;			
			power = power * 10 ;
			n = n / 2 ;
		}
		System.out.println("Decimal to Binary is " + ans);
	}
}
