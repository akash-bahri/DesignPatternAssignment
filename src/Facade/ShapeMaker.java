/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author Akash Bahri
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
/**
 * create objects for all different shapes
 */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
/**
 * call draw function for circle shape
 * @return String "circle"
 */
    public String drawCircle() {
        return circle.draw();
    }
/**
 * call draw function for rectangle shape
 * @return String "rectangle"
 */
    public String drawRectangle() {
        return rectangle.draw();
    }
/**
 * call draw function for square shape
 * @return String "square"
 */
    public String drawSquare() {
        return square.draw();
    }
}
