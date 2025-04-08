package poly.lab8.demo_ci_cd;


import org.testng.Assert;
import org.testng.annotations.Test;

import poly.lab8.demo_ci_cd.Caculator.Caculator;

public class TestCaculator {
    @Test
    public void testSum(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(1, 2), 3);
    }

    @Test
    public void testSub(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2, 1), 1);
    }
}
