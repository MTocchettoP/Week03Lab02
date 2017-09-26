/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.business;

/**
 *
 * @author 733196
 */
public class Calculator {
    
    
    public static double operate(String value1, String value2, String operation){
        double result =0.0;
        
        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);
        
        switch(operation){
            case "+": result = v1 + v2;
                break;
            case "-": result = v1 - v2;
                break;
            case "%": result = v1 % v2;
                break;
            case "*": result = v1 * v2;
                break;
        }
        
        return result;
    }
}
