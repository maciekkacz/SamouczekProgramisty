package objectsAndPackages;

public class MyNumber {
    public static void main(String[] args) {
        int number = 10;
        MyNumber myNumber = new MyNumber();
        System.out.println(myNumber.isOdd(number));
        System.out.println(myNumber.isEven(number));
        System.out.println(myNumber.sqrNumber(number));
        System.out.println(myNumber.powNumber(number));
        System.out.println(myNumber.addNumber(number));
        System.out.println(myNumber.subtractNumber(number));
    }

    public int number; // default value

    public boolean isOdd(int number) {
        return number % 2 == 1 ;
        // return !isEven();
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public double sqrNumber(double number) {
        return Math.sqrt(number);
    }

    public double powNumber(double number) {
        return Math.pow(number, 2);
    }

    public int addNumber(int otherNumber){
        int newValue = number + otherNumber;
        return newValue;
    }

    public int subtractNumber(int otherNumber) {
        // int number = any value int; if we want to change the default value
        int newValue = number - otherNumber;
        return newValue;
    }

}
