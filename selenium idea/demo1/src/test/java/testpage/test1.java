package testpage;
import base.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.home;
import static org.testng.Assert.assertEquals;
public class test1 extends base{
    home home = new home();
    @BeforeMethod
    public void begin() throws InterruptedException {
        start();
    }
    @Test
    public void testTitle() {
        assertEquals("Google",home.getTitle());
    }
    @AfterMethod
    public void stop() {
        close();
    }
}
