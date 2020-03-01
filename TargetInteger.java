package hyj_assignment6;

public class TargetInteger {
    int[] A;
    int target;
    int diff;

    public TargetInteger(int[] arr, int a) {
        this.A = arr;
        this.target = a;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 5, 8, 2};
        int target = 7;
        TargetInteger targetInteger = new TargetInteger(A, target);
        try {
            System.out.println("the index is " + targetInteger.closest());
        } catch (Exception npe) {
            System.out.println("Null Array!");
        }

    }

    public int closest() throws Exception {
        if (A == null) {
            throw new Exception();
        }
        int index = 0;
        diff = Math.abs(A[0] - target);
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i] - target) <= diff) {
                diff = Math.abs(A[i] - target);
                index = i;
            }
        }
        return index;
    }
}
