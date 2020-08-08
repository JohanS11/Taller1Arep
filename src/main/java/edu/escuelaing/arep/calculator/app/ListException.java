package edu.escuelaing.arep.calculator.app;

import java.util.List;

public class ListException extends Exception{
    public static final String EMPTY_LIST = "Empty list, unable to remove the element!";

    public ListException(){
        super();
    }
    public ListException(String message) {
        super(message);
    }
}
