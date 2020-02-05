package class7_array;

public class p2_sort {

	public static void main(String[] args) {
		int[] arr = {1, 12, 2, 34, 113, 21, 4, 5, 22, 67 };
		SelectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void SelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			Swap(arr, i, min);
		}
	}

	private static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
