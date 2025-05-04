package javapractices;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 10, 80, 50, 20, 90 };
		int r;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					r = arr[i];
					arr[i] = arr[j];
					arr[j] = r;
				}
			}

		}

		for (int q = 0; q < arr.length; q++) {
			System.out.print(arr[q]);
			System.out.print(" ");
		}

	}

}
