package Strategy;

public class Cat {
	private int height;
	private int weigth;
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
}
