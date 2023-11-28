/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryPattern;

/**
 *
 * @author Akash Bahri
 */
public class ShapeFactory {
    /**
     * method to input type of shape and get object of that type
     * @param ShapeType String
     * @return object of desired type
     */
    public Shape getShape(String ShapeType) {
      
        if (ShapeType == null) {
            return null;
        }
        if (ShapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } 
        else if (ShapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } 
        else if (ShapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
