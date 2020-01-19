package class4;
import java.util.*;

public class p4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int mask = 1 << k ; 
		int ans = n & ~mask ;
		System.out.println(ans);
	}
}
