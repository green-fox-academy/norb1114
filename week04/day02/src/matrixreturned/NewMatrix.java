package matrixreturned;

import java.util.Arrays;

public class NewMatrix {
    public static void main(String[] args) {

        int [][] mat1 = {{2, 1}, {0,1}};
        int [][] mat2 = {{0, 3}, {-1, 1}};

        int [][] result = createMatrix(mat1, mat2);
        for (int [] something : result) {
            System.out.println(Arrays.toString(something));
        }
        System.out.println();

        int [][] matt1 = {{-1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int [][] matt2 = {{0, 1, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] result2 = createMatrix(matt1, matt2);
        for (int [] ccp:result2) {
            System.out.println(Arrays.toString(ccp));
        }

    }

    public static int [][] createMatrix(int[][] matrix1, int[][] matrix2){

        int [][] newMatrix = new int[matrix1.length][matrix1.length];

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] > matrix2[i][j]){
                    newMatrix[i][j] = matrix1[i][j];
                }else if (matrix1[i][j] <= matrix2[i][j]){
                    newMatrix[i][j] = matrix2[i][j];
                }
            }

        }return newMatrix;
    }
}