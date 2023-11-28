/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Akash Bahri
 */
public class NumberDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumberObject object1 = NumberObject.getInstance();
        NumberObject object2 = NumberObject.getInstance();
        NumberObject object3 = NumberObject.getInstance();
        
        System.out.print(object1.Increase());
        System.out.print(object2.Increase());
        System.out.print(object3.Decrease());
        // TODO code application logic here
    }
    
}
