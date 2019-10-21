package loopsAndConditionalStatements;
// Task 3
public class ArrayFactory {
    public int number;

    public ArrayFactory(int number) {
        this.number = number;
    }

    int[] oneDimension() {
        return new int[number];

    }

    int[][] twoDimension() {
        int[][] array = new int[number][];
        for (int i = 0; i < number; i++) {
            array[i] = new int[number];
        }
        return array;
    }

    // Task 8

    public int[][] identityMatrix() {
        int[][] matrix = twoDimension();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}

