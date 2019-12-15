import java.util.Collection;
import java.util.HashSet;

public class Favorite extends HashSet {

    private int count = 0;
    public boolean add(Object o) {
        count++;
        return super.add(o);
    }

    public boolean addAll(Collection c) {
        count += c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return count;
    }

}
