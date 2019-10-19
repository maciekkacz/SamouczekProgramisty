package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercises01 {

    /*
    1 Napisz metodę, która zwróci Twój aktualny wiek.
    2 Napisz metodę, która zwróci Twoje imię,
    3 Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
    4 Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    5 Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
    6 Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    7 Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy,
    8 Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości
      przekazanych w argumentach można zbudować trójkąt prostokątny.
    */

    public int myAge(int age) {
        return age;
    }

    public void myName(String firstName) {
        System.out.println(firstName);
    }

    public void twoNumbers(int one, int two) {
        System.out.println(one + two);
        System.out.println(one - two);
        System.out.println(one * two);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean by3and5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public double pow3 (double number) {
        return Math.pow(number, 3);
    }

    public double sqr(double number) {
        return Math.sqrt(number);
    }

    public boolean canBulidTriangle(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            return false;
        }
        int[] sides = new int[] {number1, number2, number3};
        Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }





}
