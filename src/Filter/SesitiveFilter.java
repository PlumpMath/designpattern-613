package Filter;

public class SesitiveFilter implements Filter{

	@Override
	public String doFilter(String str) {
		
	    String r = str.replace("����ҵ", "��ҵ").replace("����", "");

		return r;
	}

}
