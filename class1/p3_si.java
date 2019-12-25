package class1;

import java.util.*;

public class p3_si {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int principal = s.nextInt();
		int time = s.nextInt();
		int rate = s.nextInt();
		int si = (time * rate * principal) / 100;
		System.out.println(si);
	}

}
