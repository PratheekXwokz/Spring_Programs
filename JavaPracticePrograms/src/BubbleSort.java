
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 1, 22, 3, 44, 5, 6, 7, 8, 10, 32, 56, 78, 90 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Print Sorted set");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
