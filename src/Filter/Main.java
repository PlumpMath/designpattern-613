package Filter;

public class Main {
	public static void main(String[] args) {
		String msg = "��Һã���<script>,���У�����ҵ�������ڿ�û�о�";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String result = mp.process();
		System.out.println(result);
	}
}
