package com.murad.chapter15.lambda_exception;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 23:54
 * @project JavaCore
 */
public class EmptyArrayException extends Exception {
    EmptyArrayException(){
        super("Массив пустой");
    }
}
