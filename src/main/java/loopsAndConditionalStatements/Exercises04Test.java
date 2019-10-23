package loopsAndConditionalStatements;

public class Exercises04Test {
    public static void main(String[] args) {
        Exercises04 exe = new Exercises04();
        // exe.numbersFromZeroToN(5);
        // exe.numbersFromZeroToN02(10);
        // exe.printNumberToDigits(12345);
        // exe.invertedWord("impossible");
        // exe.printBinary(548912);
        // System.out.println(exe.isPalindrome("kajak"));
        // exe.printArray(new int[]{5, 4, 8, 7});
        int[] array = new int[] {20, 5, 4, 3, 8, 1, 15, 2};
        exe.printArray(array);
        int[] array1 = exe.sortingNumbers(array);
        exe.printArray(array1);

    }
}
