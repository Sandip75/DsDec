package class5;

import java.util.*;

public class p4_lower_upper_case {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.nextLine().charAt(0);
		if(ch >= 'A' && ch <= 'Z'){
			System.out.println("Upper");
		}else if(ch >= 'a' && ch <= 'z'){
			System.out.println("Lower");
		}else{
			System.out.println("Invalid");
		}
	}

}
