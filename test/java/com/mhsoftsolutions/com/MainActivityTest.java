package com.mhsoftsolutions.com;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Mihindu on 09/20/2016.
 */
public class MainActivityTest {
    @Test
    public void calculateBMItestIntValues () {
        Assert.assertEquals(1.0,MainActivity.calculateBMI(100,10),0);
       // Assert.assertEquals(1.0,1.0);
    }

    @Test
    public void calculateBMItestDoubleValues () {
        Assert.assertEquals(28.515,MainActivity.calculateBMI(73,1.60),2);
        // Assert.assertEquals(1.0,1.0);
    }

    @Test
    public void calculateBMItestValues1 () {
        Assert.assertEquals(0.001,MainActivity.calculateBMI(100,300),2);
        // Assert.assertEquals(1.0,1.0);
    }



    @Test
    public void disaplyMessageUnderWeight () {
        Assert.assertEquals("Under Weight",MainActivity.BMIMessage(18.4));
    }
    @Test
    public void disaplyMessageNormal () {
        Assert.assertEquals("Normal",MainActivity.BMIMessage(18.5));
    }
    @Test
    public void disaplyMessageNormal1 () {
        Assert.assertEquals("Normal",MainActivity.BMIMessage(22.9));
    }

    @Test
    public void disaplyMessageOverweight () {
        Assert.assertEquals("Over weight",MainActivity.BMIMessage(23));
    }
    @Test
    public void disaplyMessageOverweight1 () {
        Assert.assertEquals("Over weight",MainActivity.BMIMessage(24.9));
    }

    @Test
    public void disaplyMessageObesityclass1 () {
        Assert.assertEquals("Obesity class1",MainActivity.BMIMessage(25));
    }
    @Test
    public void disaplyMessageObesityclass1_1 () {
        Assert.assertEquals("Obesity class1",MainActivity.BMIMessage(29.9));
    }

    @Test
    public void disaplyMessageObesityclass2 () {
        Assert.assertEquals("Obesity class2",MainActivity.BMIMessage(30));
    }

    @Test
    public void disaplyMessageObesityclass2_3 () {
        Assert.assertEquals("Obesity class2",MainActivity.BMIMessage(34.9));
    }
    @Test
    public void disaplyMessageObesityclass3_1 () {
        Assert.assertEquals("Obesity class3",MainActivity.BMIMessage(35));
    }
    @Test
    public void disaplyMessageObesityclass3_2 () {
        Assert.assertEquals("Obesity class3",MainActivity.BMIMessage(36));
    }
}
