package FilterWeb;

public class SesitiveFilter implements Filter{


	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
	    request.requestStr = request.requestStr.replace("被就业", "就业").replace("敏感", "");
	    chain.doFilter(request, response, chain);
	}

}
