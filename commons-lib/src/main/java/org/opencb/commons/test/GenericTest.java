package org.opencb.commons.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * Created with IntelliJ IDEA.
 * User: aaleman
 * Date: 11/5/13
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericTest {

    private TestName name = new TestName();

    private long start;

    @Rule
    public final TestName getTestName() {
        return name;
    }

    @Before
    public final void setStartTime() {
        start = System.currentTimeMillis();
    }

    @After
    public final void printEndTime() {
        long end = System.currentTimeMillis();
        float time = (end - start) / (float) 1000;
        System.out.println("Time " + name.getMethodName() + ": " + String.format("%.4f s", time));
    }

}
