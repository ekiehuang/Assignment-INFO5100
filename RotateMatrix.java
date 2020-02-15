package hyj_assignment5;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before rotating: ");
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.printMatrix(arr);
        System.out.println("After rotating: " );
        rotateMatrix.rotateMatrix(arr);

    }
    public static void printMatrix(int arr[][]){
        int N = arr.length;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public void rotateMatrix(int arr[][]){
        int N = arr.length;
        for(int i=0; i<N/2; i++) {
            for (int j = i; j < N-i-1; j++) {
                int t=arr[i][j];
                arr[i][j] = arr[N-1-j][i];
                arr[N-1-j][i] = arr[N-1-i][N-1-j];
                arr[N-1-i][N-1-j] = arr[j][N-1-i];
                arr[j][N-1-i] = t;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
