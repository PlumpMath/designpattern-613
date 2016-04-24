package iterator;
public class test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for(int i=0; i<15; i++){
			al.add(new Cat(i));
		}
		System.out.println(al.size());
	}
}
