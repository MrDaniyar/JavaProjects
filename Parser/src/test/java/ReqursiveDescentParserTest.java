import junit.framework.Assert;
import org.testng.annotations.Test;

public class ReqursiveDescentParserTest {
    private ReqursiveDescentParser parser;

    @org.junit.Before
    public void setup() {
        this.parser = new ReqursiveDescentParser();
    }

    @org.junit.Test
    public void testParseAndCalculate() throws Exception {
        int res = parser.parseAndCalculate("(2+2)*3");
        int res2 = parser.parseAndCalculate("(8*8+1)*2");
        Assert.assertEquals(res, 12);
        Assert.assertEquals(res2, 130);
    }
}
