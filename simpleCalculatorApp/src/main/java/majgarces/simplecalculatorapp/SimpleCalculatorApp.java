/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package majgarces.simplecalculatorapp;

/**
 *
 * @author Delle
 */
public class SimpleCalculatorApp {
    
    public static int add(int num1, int num2){
        return (num1 + num2);
    }
    
    public static int sub(int num1, int num2){
        return (num1 - num2);
    }

    public static int mul(int num1, int num2){
        return (num1 * num2);
    }
    
    public static int div(int num1, int num2){
        return (num1 / num2);
    }
    
    public static void main(String[] args) {
        ShowOutput ShowOutput = new ShowOutput();
        
        int result = div(4,2);
        ShowOutput.simplePrint(result);
    }
}
