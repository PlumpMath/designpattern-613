package Strategy;

public class DataSorter {

	public static void sort(Cat[] a) {
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (a[j].getHeight() > a[j+1].getHeight()) {
					svap(a,j,j+1);
				}
			}
		}
	}

	private static void svap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	private static void svap(Cat[] a, int x, int y) {
		Cat temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void p(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void p(Cat[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
}
