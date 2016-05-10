package com.anancds.junit.Ignore;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Ignore
public class TestClass{

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSane() {
        assertThat(1, is(1));
    }

    @Test (timeout = 1000)
    public void testWithTimeout() {
        try {
            Thread.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
