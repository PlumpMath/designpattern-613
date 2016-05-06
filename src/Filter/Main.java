package Filter;

public class Main {
	public static void main(String[] args) {
		String msg = "��Һã���<script>,���У�����ҵ�������ڿ�û�о�";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).
				addFilter(new SesitiveFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		fc.addFilter(fc2);
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}
}
