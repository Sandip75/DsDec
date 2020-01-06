package DsDec.class2;

import java.util.*;

public class p6_H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dot = 1;
		int star = n;
		int i = 0;
		while(i<=2*(n-1)) {
			int j = 0;
			while(j<star) {
				System.out.print("*");
				j++;
			}
			while(j<(star+dot)) {
				System.out.print(" ");
				j++;
			}
			while(j<((2*star)+dot)) {
				System.out.print("*");
				j++;
			}
			if(i<n-1) {
				star-=1;
				dot+=2;
			}
			else {
				star+=1;
				dot-=2;
			}
			System.out.println();
			i++;
			
		}
	
	}

}

