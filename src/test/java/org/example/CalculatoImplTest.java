package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatoImplTest {
    @Test
    public void Sum() {
         ICalculator cal=new CalculatoImpl();
         int result = cal.sum(20,10);
         Assert.assertEquals(30,result);

    }
    @Test  // if we don't add the tet annotation then the compiler will not compile it it will check whether there is a test annotation or not
    public void Sub() {
        ICalculator cal=new CalculatoImpl();
        int result = cal.sub(20,10);
        Assert.assertEquals(10,result);
    }
    @Test
    public void Div() {
        ICalculator cal = new CalculatoImpl();
        int result = cal.div(20, 10);
        Assert.assertEquals(2, result);
    }
    @Test // we have to add @Test( built-in ) annotation so that the compiler can know that the method has to be compiled to test it
    //@Ignore // Test ignored.
    public void Div1() {
        ICalculator cal=new CalculatoImpl();
        int result = cal.div(20,0);
        Assert.assertEquals(0,result);  // we can check the floating point value here  because we have  used the public static void assertEquals(long expected, long actual)
    }

}