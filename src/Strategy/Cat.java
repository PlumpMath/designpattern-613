package Strategy;

public class Cat implements Comparable{
	private int height;
	private int weigth;
//	private Comparator comparator = new CatHeigthComparator();
	private Comparator comparator = new CatWeightComparator();
	public Comparator getComparator() {
		return comparator;
	}
	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	public Cat(int height, int weigth) {
		super();
		this.height = height;
		this.weigth = weigth;
	}
	@Override
	public String toString(){
		return height + "||" + weigth;
	}
	@Override
	public int compareTo(Object o) {
		return  comparator.compare(this, o);
	}
}
