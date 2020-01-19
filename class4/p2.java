package class4;
import java.util.*;

public class p2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int mask = 1 << k;
		if((n & mask)==mask){
			System.out.println("On");
		}else{
			System.out.println("Off");
		}
	}

}
