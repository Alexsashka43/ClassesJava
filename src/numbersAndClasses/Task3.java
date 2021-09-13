package numbersAndClasses;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(3,4);
        Matrix matrix2 = new Matrix(3,4);
        double[][] twoArray1 = matrix1.matrix(3,4);
        double[][] twoArray2 = matrix2.matrix(3,4);

        double[][] multiTwoArray = matrix1.multiplicationMatrix(twoArray1, twoArray2); // не понял, чем он не доволен

        double[][] sumTwoArray = matrix1.sumMatrix(twoArray1, twoArray2);
        double[][] numArray = matrix1.matrixMultiNum(twoArray1, 0.54647);
        matrix1.printMatrix(twoArray1);
        matrix1.printMatrix(twoArray2);
        matrix1.printMatrix(multiTwoArray);
        matrix1.printMatrix(sumTwoArray);
        matrix1.printMatrix(numArray);
    }
}

class Matrix {
    int a; //количество строк
    int b; //количество столбцов

    public Matrix(int a, int b) {
    }

    public double[][] matrix(int a, int b) {
        double[][] twoArray = new double[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                twoArray[i][j] = random.nextDouble();
            }
        return twoArray;
    }

    public double[][] sumMatrix  (double[][] twoArray1, double[][] twoArray2) {
        double[][]sumTwoArray = new double[twoArray1.length][twoArray2[0].length];
        for (int i = 0; i < twoArray1.length; i++)
            for (int j = 0; j < twoArray1[a].length; j++) {
                sumTwoArray[i][j] = twoArray1[i][j] + twoArray2[i][j];
            }
        return sumTwoArray;
    }

    public double[][] matrixMultiNum  (double[][] twoArray, double num) {
        double[][] numArray = new double[twoArray.length][twoArray[0].length];
        for (int i = 0; i < twoArray.length; i++)
            for (int j = 0; j < twoArray[a].length; j++) {
                numArray[i][j] = twoArray[i][j] * num;
    }
        return numArray;
    }

    public double[][] multiplicationMatrix (double[][] twoArray1, double[][] twoArray2) {
        double[][] multiTwoArray = new double[twoArray1.length][twoArray2[0].length];
        for (int i = 0; i < multiTwoArray.length; i++)
            for (int j = 0; j < multiTwoArray[0].length; j++)
                for (int k = 0; k < twoArray1.length; k++) {
                    multiTwoArray[i][j] = multiTwoArray[i][j] + twoArray1[i][k] * twoArray2[k][j];
                }
        return multiTwoArray;
    }

    public void printMatrix(double[][] twoArray) {
        System.out.println(Arrays.deepToString(twoArray));
                }
            }