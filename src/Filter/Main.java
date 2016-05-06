package Filter;

public class Main {
	public static void main(String[] args) {
		String msg = "大家好：）<script>,敏感，被就业，网络授课没感觉";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).
				addFilter(new SesitiveFilter()).
				addFilter(new FaceFilter());
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}
}
