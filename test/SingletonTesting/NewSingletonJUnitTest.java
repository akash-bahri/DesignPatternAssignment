/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SingletonTesting;

import Singleton.NumberObject;
import org.junit.Test;
import static org.junit.Assert.*;
/**
/**
 *
 * @author Akash Bahri
 */
public class NewSingletonJUnitTest {
    
  
       @Test
       public void test(){
       NumberObject object1 = NumberObject.getInstance();
        NumberObject object2 = NumberObject.getInstance();
        NumberObject object3 = NumberObject.getInstance();
        
        int n1 = object1.Increase();
        int n2 = object2.Increase();
        int n3 = object3.Decrease();
        
        assertEquals(n1,n3);
       }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
