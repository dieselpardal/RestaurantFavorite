import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ToolTest {

    Tool tool = new Tool();

    @Test
    public void caseTabIs5() {
        String expect = tool.tab("oi", 5);
        assertEquals(expect,"oi   ");
    }

    @Test
    public void caseTabIsOne() {
        String expect = tool.tab("oi", 1);
        assertEquals(expect,"oi");
    }

    @Test
    public void caseTabIsZero() {
        String expect = tool.tab("oi", 0);
        assertEquals(expect,"oi");
    }

    @Test
    public void caseTabIsNegative() {
        String expect = tool.tab("oi", -10);
        assertEquals(expect,"oi");
    }

    @Test
    public void caseSubLineIsZero() {
        String expect = tool.subline(0);
        assertEquals(expect,"");
    }

    @Test
    public void caseSubLineIsFive() {
        String expect = tool.subline(5);
        assertEquals(expect,"-----");
    }

}
