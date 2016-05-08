package FilterWeb;

public class Main {
	public static void main(String[] args) {
		String msg = "��Һã���<script>,���У�����ҵ�������ڿ�û�о�";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResposeStr("response");

		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).
				addFilter(new SesitiveFilter());
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResposeStr());
	}
}
