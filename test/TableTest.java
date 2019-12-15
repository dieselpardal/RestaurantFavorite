import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class TableTest {

    Table data = new Table(new String[]{"Beauty", "Ugly"});

    @Test
    public void caseLength() {
        assertEquals(data.length(),2);
    }

    @Test
    public void caseAdd() {
        assertEquals(data.get(0),"Beauty");
        assertEquals(data.get(1),"Ugly");
        assertNull(data.get(2));
    }

    @Test
    public void caseGetAll() {
        String[] x = data.getAll();
        assertEquals(x[0],"Beauty");
        assertEquals(x[1],"Ugly");
    }

}
