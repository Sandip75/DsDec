package class8_array;

public class p2_maxSubArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -6, 1, 2, 3, -4, 5 };
		System.out.println(maxSumSubarray(arr));
	}

	public static int maxSumSubarray(int[] arr) {
		//Kadanes alg
		int cSum = arr[0];
		int oSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (cSum > 0) {
				cSum += arr[i];
			} else {
				cSum = arr[i];
			}

			if (oSum < cSum) {
				oSum = cSum;
			}
		}

		return oSum;
	}
}
