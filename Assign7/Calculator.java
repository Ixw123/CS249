/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
import java.util.Scanner;
public class Calculator {
    private static Scanner scanner; //= new Scanner(System.in);
    private static char operator;
    private static int operator_Index;
    private static double first, second, result;
    private static String first_Operand, second_Operand;
    private static boolean isError;
    
    public static double eval(String expr) throws InvalidExpressionException
    {
        try{
            scanner = new Scanner(expr);
            if(expr.indexOf('+') != -1)
                operator_Index = expr.indexOf('+');
            else if(expr.indexOf('-') != -1 )
                operator_Index = expr.indexOf('-');
            operator = expr.charAt(operator_Index);
            first_Operand = expr.substring(0, operator_Index);
            first = Double.parseDouble(first_Operand);
            second_Operand = expr.substring(operator_Index +1 , expr.length());
            second = Double.parseDouble(second_Operand);
            switch(operator)
            {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                default:
                    break;
            }
        }
        catch(Exception e){
            isError = true;
            System.out.println("Invalid expression");
            throw new InvalidExpressionException("InvalidExpressionException", e);
        }
            return result;
    }
    
}
