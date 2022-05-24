package exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionHandlingExample {

    @Test(expectedExceptions = {Exception.class}, groups = "p0")
    public void testCase1(){
        System.out.println(10/0);
        System.out.println("test cases 1");
    }

    @Test(expectedExceptions = {IOException.class, Exception.class})
    public void testCase2(){
        String s = null;
        System.out.println("test cases 2");
        System.out.println(s.length());
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testCase3() throws Exception{
        System.out.println("test cases 3");
        throw new IOException();
    }

    public void testCase4(){
        System.out.println("test cases 4");
    }

    public void testCase5(){
        System.out.println("test cases 5");
    }

    public void testCase6(){
        System.out.println("test cases 6");
    }

    public void testCase7(){
        System.out.println("test cases 7");
    }

    public void testCase8(){
        System.out.println("test cases 8");
    }
}
