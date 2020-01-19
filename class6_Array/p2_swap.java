package class6_Array;

public class p2_swap {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr, 0 , 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	private static void swap(int[] arr,int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}

}
