/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPatternsTest;


import com.zaakir.designPatterns.bridge.BigBus;
import com.zaakir.designPatterns.bridge.BigEngine;
import com.zaakir.designPatterns.bridge.SmallCar;
import com.zaakir.designPatterns.bridge.SmallEngine;
import com.zaakir.designPatterns.bridge.Vehicle;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class bridgeTest {
    
    public bridgeTest() {
    }

    @Test
     public void test() {
     
         Vehicle vehicle = new BigBus(new SmallEngine());
         assertEquals(vehicle.drive(), "slow");
     vehicle.setEngine(new BigEngine());
     assertEquals(vehicle.drive(), "slow");
      Vehicle vehicle1 = new SmallCar(new SmallEngine());
         assertEquals(vehicle1.drive(), "average");
     vehicle1.setEngine(new BigEngine());
     assertEquals(vehicle1.drive(), "fast");
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
