package FilterWeb;

public class Main {
	public static void main(String[] args) {
		String msg = "大家好：）<script>,敏感，被就业，网络授课没感觉";
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
