package Exceptions;


class EvenNumberException extends Exception { //We are extending Exception class
    //Let's use constructor for the EvenNumberException class for flexibility (could live w/o constructor
    EvenNumberException(String message) {
        super(message);
    }
}

