package DsDec.class2;
import java.util.*;

public class p3_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int dot = n-1;
		int i = 0;
		while(i<n) {
			int j = 0;
			while(j<dot) {
				System.out.print("  ");
				j++;
			}
			while(j < (star+ dot )) {
				System.out.print("* ");
				j++;
			}
			dot--;
			star++;
			System.out.println();
			i++;
		}
	}

}
