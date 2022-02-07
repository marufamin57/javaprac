package hooks;

import io.cucumber.java.*;

public class setup {
    @Before
    public void setup1(){
        System.out.println("setup");
    }
    @After
    public void close(){
        System.out.println("close");
    }
    @BeforeStep
    public void befstep(){
        System.out.println("before step");
    }
    @AfterStep
    public void afstep(){
        System.out.println("after step");
    }
//    @BeforeAll
//    public static void before_all(){
//        System.out.println("before all");
//    }
//    @AfterAll
//    public static void after_all(){
//        System.out.println("after all");
//    }
}
