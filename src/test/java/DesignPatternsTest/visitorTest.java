package DesignPatternsTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.zaakir.designPatterns.visitor.NumberElement;
import com.zaakir.designPatterns.visitor.Numbervisitor;
import com.zaakir.designPatterns.visitor.SumVisitor;
import com.zaakir.designPatterns.visitor.ThreeElement;
import com.zaakir.designPatterns.visitor.TotalVisitor;
import com.zaakir.designPatterns.visitor.TwoElement;
import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class visitorTest {
    
    public visitorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     TwoElement two1 = new TwoElement(3, 3);
     TwoElement two2 = new TwoElement(2, 7);
     ThreeElement three1 = new ThreeElement(3, 4, 5);
     
     List<NumberElement> numberElements = new ArrayList<NumberElement>();
     numberElements.add(two1);
     numberElements.add(two2);
     numberElements.add(three1);
     
     Numbervisitor sumVisitor = new SumVisitor();
     sumVisitor.visit(numberElements);
     
     TotalVisitor totalSumVisitor = new TotalVisitor();
     totalSumVisitor.visit(numberElements);
             assertEquals(totalSumVisitor.getTotalSum(), 0);
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
