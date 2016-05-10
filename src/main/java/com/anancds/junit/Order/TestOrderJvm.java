package com.anancds.junit.Order;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
public class TestOrderJvm {
    @Test
    public void testFirst() throws Exception {
        System.out.println("--------1---------");
    }

    @Test
    public void testSecond() throws Exception {
        System.out.println("------------2----------");

    }

    @Test
    public void testThird() throws Exception {
        System.out.println("-----------3----------");
    }

}
