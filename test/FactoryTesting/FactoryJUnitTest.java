/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package FactoryTesting;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akash Bahri
 */
public class FactoryJUnitTest {
    
    ShapeFactory shapeFactory = new ShapeFactory(); 
    @Test
    public void factorytestcircle(){
        Shape shape1 = shapeFactory.getShape("CIRCLE"); 
        String newshape = shape1.draw(); 
        assertSame("circle",newshape);
    }
    @Test
    public void factorytestrectangle(){
        Shape shape2 = shapeFactory.getShape("RECTANGLE"); 
        String newshape =shape2.draw(); 
        assertSame("rectangle",newshape);
    }
    @Test
    public void factorytestsquare(){
        Shape shape3 = shapeFactory.getShape("SQUARE"); 
        String newshape =shape3.draw();
        assertSame("square",newshape);
    }
       

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
