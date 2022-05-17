import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(summ(5, 6));

        int[][] matrix = new int[][]{
                {1, 5, 8, 7},
                {6, 4, 3, 1},
                {9, 1, 2, 5},
                {3, 0, 1, 4}
        };
        drawingTopLeft(matrix);
        drawingTopRight(matrix);
        drawingBottomLeft(matrix);
        drawingBottomRight(matrix);

        int[] oddArray = new int[50];
        for (int i = 1; i < 100; i += 2) {
            oddArray[i / 2] = i;
        }

        for (int k : oddArray) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = oddArray.length - 1; i >= 0; i--) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        int[] mass = new int[12];
        Random rnd = new Random();
        mass = rnd.ints(mass.length, 0, 15).toArray();
        System.out.println(Arrays.toString(mass));
        int max = mass[0];
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (max <= mass[i]) {
                max = mass[i];
                index = i;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Index:" + index + 1);

        int[] array = rnd.ints(20, 0, 20).toArray();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));


        int[] arr = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        System.out.println(Arrays.toString(arr));
        max = arr[0];
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                index = i;
            }
            if (arr[i] == 0) {
                index2 = i;
            }
        }
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));


        int counter = 0;
        boolean isHaveMatch = false;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    counter++;
                }
            }
            if (counter > 1) {
                isHaveMatch = true;
                System.out.println("Match element - " + i);
            }
            counter = 0;
        }
        if (!isHaveMatch) System.out.println("There are no matches.");


        System.out.println("Enter matrix size");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matr = new int[n][n];
        for (int i = 0; i <matr.length; i++) {
            matr[i] = rnd.ints(matr[i].length, 0,50).toArray();
        }

        Arrays.stream(matr).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println();
        matr = transposeMatrix(matr);
        Arrays.stream(matr).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println();

        calculateSumOfDiagonalElements(matr);

        printMatrix(matr);

        dopTask();
    }

    public static void dopTask(){
        Random rnd = new Random();
        int[][]matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = rnd.ints(matrix.length,0,10000).toArray();
        }
        Arrays.stream(matrix).forEach(x -> System.out.println(Arrays.toString(x)));
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int indexOfMaxI = 0;
        int indexOfMaxJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-3; j++) {
                for (int k = j; k < j+3; k++) {
                    sum+=matrix[i][k];
                }
                if (maxSum < sum){
                    maxSum = sum;
                    indexOfMaxI = i;
                    indexOfMaxJ = j;
                }
                sum = 0;
            }
        }

        System.out.println("Max triple is: " + maxSum);
        System.out.println("Indexes of triple is: " + (indexOfMaxI+1) + " " + (indexOfMaxJ + 1));
    }

    public static void printMatrix(int[][] matrix) {
        String out;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                out = "*";
                if (anInt % 7 == 0) out = "-";
                if (anInt % 3 == 0) out = "+";
                System.out.print(out + " ");
            }
            System.out.println();
        }
    }

    public static void calculateSumOfDiagonalElements(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum+=m[i][i];
        }
        System.out.println(sum);
    }

    public static int[][] transposeMatrix(int [][] m){
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

    private static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    private static void drawingTopLeft(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= matrix.length - i - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void drawingTopRight(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void drawingBottomRight(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j <= matrix.length - i - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void drawingBottomLeft(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
