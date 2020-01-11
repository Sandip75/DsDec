package class3;
import java.util.*;

public class p7_H_GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int c;
		int d;
		c = Gcd(n1,n2);
		d = Lcm(n1,n2);
		System.out.println("The Gcd of no is "+c);
		System.out.println("The Lcm is "+d);

	}
	public static int Gcd(int n1,int n2)
	{   int ans =0;
		while(n1>0) {
			if(n1>n2) {
				n2=n1+n2;
				n1=n2-n1;
				n2=n2-n1;
			}
			ans = n1;
			n1 = n2%n1;
			n2 = ans;
		}
		return(ans);
	}
	public static int Lcm(int a, int b) {
		int g = Gcd(a,b) ;
		int L = (a*b)/g;
		return(L);

	}
}
