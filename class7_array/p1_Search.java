package class7_array;

public class p1_Search {

	public static void main(String[] args) {
		int[] arr = { 12, 13, 23, 34, 56, 67, 78, 91, 97, 111, 345 };
		System.out.println(LinearSearch(arr, 78));
		System.out.println(BinarySearch(arr, 78));
	}

	public static int LinearSearch(int[] a, int find) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == find)
				return i;
		}
		return -1;
	}

	public static int BinarySearch(int[] a, int find) {
		int s = 0;
		int e = a.length - 1;

		while (s <= e) {
			int mid = s +  ( e- s) / 2;
			if (a[mid] == find)
				return mid;
			else if(a[mid] > find )
				e = mid - 1;
			else
				s= mid + 1;
		}

		return -1;
	}
}
