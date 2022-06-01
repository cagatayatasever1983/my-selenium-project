package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Day03_FirstJunitClass {

   @ Before
    public void setup(){
        System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test1() {
        System.out.println("this is Test 1");

    }


     @Test
     public void test2(){
            System.out.println("this is Test 2");

    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("this is test3");
    }
    @Test
    public void test4(){
        System.out.println("this is test4");
    }

}

/*
During Junit application, we can use annotation such as @Before.@After,@Test.those are special for junit
 */


