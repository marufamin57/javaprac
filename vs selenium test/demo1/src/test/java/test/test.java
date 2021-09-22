package test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import home.home;

public class test extends base {
    base base = new base();
    home home = new home();

    @BeforeMethod
    public void start() {
        base.start();
    }

    @Test

    public void titletest() {

        String title = browser.getTitle();
        Assert.assertEquals("Google", title);

    }

    @AfterMethod
    public void end() {
        base.close();
    }

}
