package FilterWeb;

public interface Filter {
	void doFilter(Request request,Response response,FilterChain chain);
}
