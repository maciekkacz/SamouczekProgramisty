package objectsAndPackages;

public class Rectangle {
    // Task 2
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int circuit(int lenght, int width) {
        return 2 * lenght + 2 * width;
    }
    public int surfaceArea(int lenght, int width) {
        return lenght * width;
    }
    public int diagonalLenght(int lenght, int width) {
        return (int) Math.sqrt(Math.pow(lenght, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        int lenght = 5;
        int widht = 10;
        Rectangle rect = new Rectangle();
        System.out.println(rect.surfaceArea(lenght,widht));
        System.out.println(rect.diagonalLenght(lenght,widht));
        System.out.println(rect.circuit(lenght,widht));
    }
}
