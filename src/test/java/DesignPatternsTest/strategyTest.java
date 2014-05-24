package DesignPatternsTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.zaakir.designPatterns.strategy.Context;
import com.zaakir.designPatterns.strategy.HikeStrategy;
import com.zaakir.designPatterns.strategy.SkiStrategy;
import com.zaakir.designPatterns.strategy.Strategy;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class strategyTest {
    
    public strategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     int temperatureInF = 60;
     
     Strategy skiStrategy = new SkiStrategy();
     Context context = new Context(temperatureInF, skiStrategy);
         assertFalse(context.getResult());
     Strategy hikeStrategy = new HikeStrategy();
     context.setStrategy(hikeStrategy);
         assertTrue(context.getResult());
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
