package Exceptions;

class OddCalculator {
    public int sumOddNumbers(int a, int b) throws EvenNumberException {
        if (a % 2 == 0) {
            throw new EvenNumberException("This number is even");
        } else if (b % 2 == 0) {
            throw new EvenNumberException("This number is even");
        }
        return a + b;
    }

    public int sumDifferentOddNumbers(int a, int b) throws EvenNumberException, DublicateInputException{
        if (a%2==0 || b% 2 == 0){
            throw new EvenNumberException("One or more input was even!");
        }
        if (a == b){
            throw new DublicateInputException();
        }
        return a + b;
    }
}
