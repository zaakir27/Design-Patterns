/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPatternsTest;


import com.zaakir.designPatterns.adapter.TemperatureClassReporter;
import com.zaakir.designPatterns.adapter.TemperatureInfo;
import com.zaakir.designPatterns.adapter.TemperatureObjectReporter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class adapterTest {
    
    public adapterTest() {
    }

    @Test
     public void adapTest() {
     
     TemperatureInfo tempInfo = new TemperatureClassReporter();
     tempInfo.setTemperatureInC(10);
         assertEquals(tempInfo.getTemperatureInC(), 10.0);
         assertEquals(tempInfo.getTemperatureInF(), 50.0);
         
         tempInfo = new TemperatureObjectReporter();
         tempInfo.setTemperatureInf(85);
         assertEquals(tempInfo.getTemperatureInC(), 29.444444444444443);
         assertEquals(tempInfo.getTemperatureInF(), 85.0);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
