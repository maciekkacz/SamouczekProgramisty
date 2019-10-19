package tables;

public class Exercises03 {
    /*
    1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
    2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy
    w odwróconej kolejności
    */

    private static String[] get5AlphabetLetters() {
        return new String[] {"a", "ą", "b", "c", "ć"};
    }

    private static double[] revertArray(double[] array) {
        return new double[] {array[2], array[1], array[0]};
    }

}
