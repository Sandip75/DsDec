package DsDec.class2;

import java.util.*;

public class p2_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0;
		int star = n ;
		while(i < n) {
			int j =0;
			while(j < star) {
				System.out.print("*");
				j++;
			}
			star--;
			System.out.println();
			i++;
		}
	}

}
