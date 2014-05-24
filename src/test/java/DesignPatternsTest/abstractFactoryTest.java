/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPatternsTest;


import com.zaakir.designPatterns.abstractfactory.AbstractFractory;
import com.zaakir.designPatterns.abstractfactory.SpeciesFactory;
import com.zaakir.designPatterns.factorymethod.Animal;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class abstractFactoryTest {
    
    public abstractFactoryTest() {
    }

    @Test
     public void abstractTest() {
     AbstractFractory abstractFactory1 = new AbstractFractory();
         SpeciesFactory speciesFactory1 = abstractFactory1.getSpeciesFactory("Reptile");
         Animal a = speciesFactory1.getAnimal("Tyrannosaurus");
         AbstractFractory abstractFractory2 = new AbstractFractory();
         SpeciesFactory speciesFactory2 = abstractFractory2.getSpeciesFactory("Mammal");
         Animal b = speciesFactory2.getAnimal("dog");
         assertEquals(a.makeSound(), "Roar");
         assertEquals(b.makeSound(), "woof");
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
