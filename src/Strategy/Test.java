package Strategy;

public class Test {
	public static void main(String[] args) {
		Cat[] a = {new Cat(3, 5),
				new Cat(2, 4),
				new Cat(4, 7)};
		DataSorter.sort(a);
		DataSorter.p(a);
		
	
	}
}
