import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class DataTest {

    @Test(expected=NullPointerException.class)
    public void caseAdd() {
        Data data = new Data(2);
        data.add(10);
        data.add(20);
        data.add(30);
        assertEquals(data.get(0),10);
        assertEquals(data.get(1),20);
        assertNull(data.get(2));
    }

    @Test
    public void caseGetAll() {
        Data data = new Data(2);
        data.add(10);
        data.add(20);
        data.add(30);
        assertEquals(data.getAll().length,2);
        int[] x = data.getAll();
        assertEquals(x[0],10);
        assertEquals(x[1],20);
    }

}
