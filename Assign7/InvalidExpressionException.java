/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class InvalidExpressionException extends Exception{
    public InvalidExpressionException(String message,Exception e)
    {
        super(message, e);
    }
    
}
