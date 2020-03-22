package hyj_assignment7;

public class IndexEx_test {
    static void index(int a) throws MyIndexOutOfBoundException {
        if (a > 9) {
            throw new MyIndexOutOfBoundException(a);
        } else {
            System.out.println("the index is " + a);
        }
    }

    public static void main(String args[]) {
        try {
            index(5);
            index(10);
        } catch (MyIndexOutOfBoundException ex) {
            System.out.println(ex);
        }
    }
}
