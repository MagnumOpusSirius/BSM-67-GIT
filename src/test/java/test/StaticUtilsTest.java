package test;

import org.example.inject.StaticUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StaticUtilsTest {

    StaticUtils staticUtils;

    @BeforeEach
    public void init(){
        staticUtils = new StaticUtils();
    }

    @Test
    public void testPrivateMethod(){
        assertEquals(staticUtils.getTest("Hello"), "HelloBuilding"); // why will it fail? Ans: private method is not mocked
    }

    @Test
    public void testPrivateMethod1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method= StaticUtils.class.getDeclaredMethod("privateTest", String.class);
        method.setAccessible(true);
        StaticUtils staticUtils = new StaticUtils();
        String result=(String) method.invoke(staticUtils, "Hello");
        assertEquals(result, "HelloBuilding");
    }

    @Test
    public void staticTest(){
        try(MockedStatic mockedStatic= Mockito.mockStatic(StaticUtils.class)){ //try with resources
            mockedStatic.when(()->StaticUtils.range()).thenReturn("Welcome");
            assertEquals(StaticUtils.range(), "Welcome");
        }
    }

}
