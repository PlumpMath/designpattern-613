package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public class FilterChain implements  Filter{
    List<Filter> filters = new ArrayList<>();
    public FilterChain addFilter(Filter f){
        this.filters.add(f);
        return this;
    }
    public String doFilter(String str){
        String r = str;
        for (Filter f : filters){
            r = f.doFilter(r);
        }
        return r;
    }


}
