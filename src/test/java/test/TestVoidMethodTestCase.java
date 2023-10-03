package test;

import org.example.inject.TestVoidMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVoidMethodTestCase {

    TestVoidMethod testVoidMethod = new TestVoidMethod();

    @BeforeEach
    public void init(){
        testVoidMethod.add("Apple");
        testVoidMethod.add("Orange");
    }

    @Test
    public void testVoidMethod(){
        assertEquals(2, testVoidMethod.size());
    }
}
