package com.anancds.junit.Categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.fail;

public class A {
    @Test
    public void a() {
        System.out.println("A.a");
        fail();
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
        System.out.println("A.b");
    }

}
