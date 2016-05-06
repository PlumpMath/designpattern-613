package Filter;

/**
 * Created by Administrator on 2016/5/6 0006.
 */
public class FaceFilter implements Filter {

    @Override
    public String doFilter(String str) {
        return str.replace("£º£©","vv");
    }
}
