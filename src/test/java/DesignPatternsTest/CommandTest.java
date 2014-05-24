package DesignPatternsTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.zaakir.designPatterns.command.Command;
import com.zaakir.designPatterns.command.Dinner;
import com.zaakir.designPatterns.command.DinnerCommand;
import com.zaakir.designPatterns.command.Lunch;
import com.zaakir.designPatterns.command.LunchCommand;
import com.zaakir.designPatterns.command.MealInvoker;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CommandTest {
    
    public CommandTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     Lunch lunch = new Lunch();
     Command lunchCommand = new LunchCommand(lunch);
     
     Dinner dinner = new Dinner();
     Command dinnerCommand = new DinnerCommand(dinner);
     
         MealInvoker mealInvoker = new MealInvoker(lunchCommand);
         assertEquals(mealInvoker.invoke(), "lunch");
         
         mealInvoker.setCommand(dinnerCommand);
         assertEquals(mealInvoker.invoke(), "dinner");
     
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
