package com.coding.basic.container;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {

    ArrayList list;
    @Before
    public void setUp() throws Exception {
        list = new ArrayList();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testArrayList() {
        assertEquals(0, list.size());
    }

    @Test
    public void testAddObject() {
        list.add("0");
        assertEquals("0", list.get(0));
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testAddObject1() {
        list.get(1);
    }

    @Test
    public void testAddIntObject() {
        list.add(0, "0");
        assertEquals("0", list.get(0));
    }

    @Test
    public void testRemoveInt() {
        fail("Not yet implemented");
    }

    @Test
    public void testSet() {
        fail("Not yet implemented");
    }

    @Test
    public void testGet() {
        fail("Not yet implemented");
    }

    @Test
    public void testToString() {
        fail("Not yet implemented");
    }

    @Test
    public void testSize() {
        fail("Not yet implemented");
    }

    @Test
    public void testIsEmpty() {
        fail("Not yet implemented");
    }

    @Test
    public void testIterator() {
        fail("Not yet implemented");
    }

    @Test
    public void testRemoveObject() {
        fail("Not yet implemented");
    }

}
