package edu.uoc.ds.adt;

import edu.uoc.ds.adt.utils.TestFunctions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.util.function.Function;

import static org.junit.Assert.*;

public class PR1StackTest {

    PR1Stack pr1s;

    private void fillStack() {
        for (int x = 0; x < PR1Stack.CAPACITY; x++) {
            pr1s.push(TestFunctions.FUNCTION_1.apply(x));
        }
    }

    @Before
    public void setUp() {
        this.pr1s = new PR1Stack();

        assertNotNull(this.pr1s.getStack());
        this.fillStack();
    }

    @After
    public void release() {
        this.pr1s = null;
    }

    @org.junit.Test
    public void stackTest() {

        assertEquals(PR1Stack.CAPACITY, this.pr1s.getStack().size());

        Assert.assertEquals(240, pr1s.pop());
        Assert.assertEquals(210, pr1s.pop());
        Assert.assertEquals(182, pr1s.pop());
        Assert.assertEquals(156, pr1s.pop());
        Assert.assertEquals(132, pr1s.pop());
        Assert.assertEquals(110, pr1s.pop());
        Assert.assertEquals(90, pr1s.pop());
        Assert.assertEquals(72, pr1s.pop());
        Assert.assertEquals(56, pr1s.pop());
        Assert.assertEquals(42, pr1s.pop());
        Assert.assertEquals(30, pr1s.pop());
        Assert.assertEquals(20, pr1s.pop());
        Assert.assertEquals(12, pr1s.pop());
        Assert.assertEquals(6, pr1s.pop());
        Assert.assertEquals(2, pr1s.pop());

        assertEquals(0, this.pr1s.getStack().size());
    }

}