package class6_Array;

public class p1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length; i++){
			arr[i] = 10 + i ;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println(arr);
	}

}
