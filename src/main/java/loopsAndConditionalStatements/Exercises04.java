package loopsAndConditionalStatements;

public class Exercises04 {
    /*
    1. Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
    2. Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
    3. Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
    a  int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
    b  int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
    4  Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry
       (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
    5  Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
       Na przykład “pies” przekształci w “seip”,
    6  Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.).
    7  Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem
       to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    8  Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
    9  Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
    10 Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do
       największej liczby. Jednym z podstawowych algorytmów sortowania jest sortowanie bąbelkowe.
    */
    // Task 1
    public void numbersFromZeroToN(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
    // Task 2
    public void numbersFromZeroToN02(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.println(counter);
            counter++;
        }
    }
    // Task 4
    public void printNumberToDigits(int number) {
        while (number > 0) {
            int digits = number % 10;
            number /= 10;
            System.out.println(digits);
        }
    }
    // Task 5
    public static String invertedWord(String word) {
        char[] chars = word.toCharArray();
        for (int singleCharacter = 0; singleCharacter < chars.length / 2; singleCharacter++) {
            char tempChar = chars[singleCharacter];
            int curretnCharFromEndIndex = chars.length - singleCharacter - 1;

            chars[singleCharacter] = chars[curretnCharFromEndIndex];
            chars[curretnCharFromEndIndex] = tempChar;
        }
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        return result;
    }
    // Task 6
    public static void printBinary(int number) {
        String binaryReversed = "";
        while (number > 0) {
            binaryReversed += number % 2;
            number /= 2;
        }
        System.out.println(invertedWord(binaryReversed));
    }
    // Task 7

    public static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetter = chars[i];
            char correspondantLetterFromEnd = chars[chars.length - i - 1];
            if (!(currentLetter == correspondantLetterFromEnd)) {
                return false;
            }
        }
        return true;
    }
    // Task 9
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            boolean isLastOne = i == array.length - 1;
            if (isLastOne) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i]);
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //Task 10
    public static int[] sortingNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int next = j + 1;
                if (array[j] > array[next]) {
                    int tmp = array[next];
                    array[next] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
