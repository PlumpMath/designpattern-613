package FilterWeb;

public class SesitiveFilter implements Filter{


	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
	    request.requestStr = request.requestStr.replace("����ҵ", "��ҵ").replace("����", "");
	    chain.doFilter(request, response, chain);
	}

}
