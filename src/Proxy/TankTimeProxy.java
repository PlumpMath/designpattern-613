package Proxy;
public class TankTimeProxy implements Moveable{
    Moveable t;
 	 @Override 
	 public void move() { 
			long start = System.currentTimeMillis();
			t.move();
			long end = System.currentTimeMillis();
			System.out.println("time:" + (start - end));
	 }
	 public TankTimeProxy(Moveable t) {
			super();
			this.t = t;
	 }
	}