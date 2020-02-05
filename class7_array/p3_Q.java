package class7_array;

public class p3_Q {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 4, 2 };
		int[] ans = invers(arr);
		for (int value : ans) {
			System.out.print(value + " ");
		}
		System.out.println(mirrorInverse(arr, ans));
	}

	public static int[] invers(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			ans[val] = i;
		}
		return ans;
	}

	public static boolean mirrorInverse(int[] arr, int[] inv) {

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (inv[val] != i)
				return false;
		}

		return true;
	}

}
