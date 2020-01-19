package class5;

import java.util.*;

public class p5_convertchar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.nextLine().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			char ans = (char) (ch + 'a' - 'A');
			System.out.println(ans);
		} else if (ch >= 'a' && ch <= 'z') {
			char ans = (char) (ch + 'A' - 'a');
			System.out.println(ans);
		} else {
			System.out.print("Invalid");
		}
	}

}
