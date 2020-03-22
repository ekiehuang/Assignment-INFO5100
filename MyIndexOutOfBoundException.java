package hyj_assignment7;

public class MyIndexOutOfBoundException extends Exception {
    protected int lowerBound = 0;
    protected int upperBound = 9;
    protected int index;

    MyIndexOutOfBoundException(int ind) {
        index = ind;
    }

    public String toString() {
        return "Error Message: Index: " + index + ", but Lower bound:" + lowerBound + ", Upper bound: " + upperBound;
    }
}
