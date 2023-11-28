/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Akash Bahri
 */
public class NumberObject {
    private static NumberObject instance = new NumberObject();
    /**
     * making NumberObject reference private to make sure new object cannot be instantiated
     */
    private NumberObject(){}
    private static int num = 0;
    /**
     * method to get the instance object of NumberObect class
     * @return static instance object
     */
    public static NumberObject getInstance(){
        return instance;
    }
    /**
     * method to increase number
     * @return integer number increased by 1
     */
    public static int Increase(){
        return ++num;
        
    }
    /**
     * method to decrease number
     * @return integer number decreased by 1
     */
    public static int Decrease(){
        return --num;
    }
}
