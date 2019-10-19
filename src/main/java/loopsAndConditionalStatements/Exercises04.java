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
       Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
       Na przykład “pies” przekształci w “seip”,
       Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.).
       System binarny opisałem w osobnym artykule,
       Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem
       to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
       Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci “[liczba, liczba, liczba]”,
       Napisz metodę, która pobierze tablicę liczb całkowitych i posortuje ją w kolejności od najmniejszej do
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
}
