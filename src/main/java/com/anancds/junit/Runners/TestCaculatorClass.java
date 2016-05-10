package com.anancds.junit.Runners;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.io.IOException;
import java.util.List;
import com.google.common.collect.Lists;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCaculatorClass {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Parameters
    public static List<Object[]> data() {
        return Lists.asList(new Object[]{-1, 1, 0}, new Object[][]{{20, 20, 40},{30, 30, 60},{-5, -5, -10}});
    }
    @Parameter(value = 0)
    public int o1;
    @Parameter(value = 1)
    public int o2;
    @Parameter(value = 2)
    public int expector;

    @Test
    public void test() throws IOException, RuntimeException{
        CaculatorClassForTest cal = new CaculatorClassForTest();
        assertEquals(expector, cal.sum(o1, o2));
    }

    @Test
    public void testO1Exception(){
        CaculatorClassForTest cal = new CaculatorClassForTest();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("o1 is too big");
        cal.sum(300, 100);
    }
    @Test
    public void testO2Exception(){
        CaculatorClassForTest cal = new CaculatorClassForTest();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("o2 is too big");
        cal.sum(100, 300);
    }

}
