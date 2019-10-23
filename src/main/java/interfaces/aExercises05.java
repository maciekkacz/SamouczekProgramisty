package interfaces;

/*
Create a Figure interface. The interface should contain getPerimeter (returning the perimeter) and getArea
(returning the surface) methods. Then create the Circle, Triangle and Rectangle classes, let each class implement
the Figure interface. Write a program that will download from the user:
- circle radius length,
- 2 sides of the right triangle (sides at right angles),
- the length of the sides of the rectangle.
*/

public class aExercises05 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(2,2,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());



    }
}
