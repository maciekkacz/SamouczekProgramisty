package methods;

public class ExercisesTest {
    public static void main(String[] args) {
        Exercises exe = new Exercises();
        System.out.println(exe.myAge(30));
        exe.myName("Maciek");
        exe.twoNumbers(10,20);
        System.out.println(exe.isEven(20));
        System.out.println(exe.by3and5(21));
        System.out.println(exe.pow3(10));
        System.out.println(exe.sqr(100));
        System.out.println(exe.canBulidTriangle(5,10,15));


    }
}
