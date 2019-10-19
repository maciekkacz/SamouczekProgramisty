package loopsAndConditionalStatements;
// Task 3
public class ArrayFactory {
    private int number;

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

}
