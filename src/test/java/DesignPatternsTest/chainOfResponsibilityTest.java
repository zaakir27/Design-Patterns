package DesignPatternsTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.zaakir.designpatterns.chainOfResponsibility.EarthHandler;
import com.zaakir.designpatterns.chainOfResponsibility.MercuryHandler;
import com.zaakir.designpatterns.chainOfResponsibility.PlanetEnum;
import com.zaakir.designpatterns.chainOfResponsibility.PlanetHandler;
import com.zaakir.designpatterns.chainOfResponsibility.VenusHandler;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class chainOfResponsibilityTest {
    
    public chainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         PlanetHandler chain = setUpChain();
         assertEquals(chain.handleRequest(PlanetEnum.VENUS), "venus");
         assertEquals(chain.handleRequest(PlanetEnum.MERCURY),"mercury");
         assertEquals(chain.handleRequest(PlanetEnum.EARTH),"earth");
         
         
         
     }
    public static PlanetHandler setUpChain()
         {
             PlanetHandler mercuryHandler = new MercuryHandler();
              PlanetHandler venusHandler = new VenusHandler();
               PlanetHandler earthHandler = new EarthHandler();
               mercuryHandler.setSuccessor(venusHandler);
               venusHandler.setSuccessor(earthHandler);
              return mercuryHandler;   
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
