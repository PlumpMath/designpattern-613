package FilterWeb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public class FilterChain implements  Filter{
    List<Filter> filters = new ArrayList<>();
    int index = 0;
    public FilterChain addFilter(Filter f){
        this.filters.add(f);
        return this;
    }
  
	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		if (index == filters.size()) {
			return;
		}
		Filter f = filters.get(index);
		index++;
        f.doFilter(request,response,chain);
	}


}
