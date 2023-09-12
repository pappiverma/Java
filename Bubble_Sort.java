class Bubble_Sort {
	public static void main(String[] arg) {

		int temp;
		int[] a = { 2, 7, 1, 15, 4 };
		for (int i = 0; i <= a.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j <= a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];

					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

			if (flag == 0) {
				break;

			}
		}

	}
}
