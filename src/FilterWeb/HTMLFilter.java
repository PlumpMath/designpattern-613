package FilterWeb;

public class HTMLFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		request.requestStr = request.requestStr.replace('<', '[').replace('>', ']');
		chain.doFilter(request, response, chain);
	
	}

}
