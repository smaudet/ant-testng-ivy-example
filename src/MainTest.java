import org.testng.*;
import org.testng.annotations.*;

public class MainTest{
    @Test(groups = { "standard" })
    public void doTest(){
        Assert.assertEquals(1,1);
    }
    @Test(groups = { "standard" })
    public void doFail(){
        // Assert.fail();
        Assert.assertEquals(1,1);
    }
}
