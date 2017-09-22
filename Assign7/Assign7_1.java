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
public class Assign7_1 {
    private static Scanner scanner = new Scanner(System.in);
    private static String input;
    private static double answer;
    public static void main(String[] args)
    {
        try{
            System.out.println("Enter an expression");
            input = scanner.nextLine();
            answer = Calculator.eval(input);
            System.out.println("Answer is " + answer);
        }
        catch(InvalidExpressionException e)
        {
            System.out.println("InvalidExpressionException: Invalid expression");
            StackTraceElement [] s = Thread.currentThread().getStackTrace();
            for(StackTraceElement st: s)
                System.out.println(st);
        }
    }
    
}
