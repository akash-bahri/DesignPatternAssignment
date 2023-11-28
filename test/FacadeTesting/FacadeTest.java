/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package FacadeTesting;
import Facade.ShapeMaker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akash Bahri
 */
public class FacadeTest {
     @Test
    public void testCircle(){
        ShapeMaker shapeMaker = new ShapeMaker();        
        assertEquals("circle",shapeMaker.drawCircle());
    }
    @Test
    public void testSquare(){
        ShapeMaker shapeMaker = new ShapeMaker();
        assertEquals("square",shapeMaker.drawSquare());
    }
    @Test
    public void testRectangle(){
        ShapeMaker shapeMaker = new ShapeMaker();
        assertEquals("rectangle",shapeMaker.drawRectangle());
    }
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
