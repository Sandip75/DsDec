package class4;

public class p1 {

	public static void main(String[] args) {
		byte bn = 10 ;
		short sn = 10;
		int in = 10;
		long ln = 100;
		
		ln = in;
		ln = sn ;
		ln = bn;
		
		
		// in = ln;
		in = sn ;
		in = bn;
		
//		bn = sn ;
//		bn = in ;
//		bn = ln ;
		
		in = 1;
		bn = (byte)256;
		// in = 128 ;
		// System.out.println(in);
		System.out.println(bn);
	}

}
