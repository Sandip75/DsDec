package class6_Array;

import java.util.*;

public class p3_max {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// ####### Max number ############
		// int n = s.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = s.nextInt();
		// }
		// int ans = maximumIndex(arr);
		// System.out.println(arr[ans]);

		// ######### Linear Serach ###########
		int k = 122;
		int[] arr = { 10, 123, 122, 45 };
		int ans = linearSearch(arr, k);
		System.out.println(ans);
		

	}

	public static int maximumIndex(int[] a) {
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[index]) {
				index = i;
			}
		}
		return index;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int linearSearch(int[] arr , int element){
		for(int i=0; i < arr.length; i++){
			if(arr[i] == element)
				return i;
		}
		return -1;
	}
}
