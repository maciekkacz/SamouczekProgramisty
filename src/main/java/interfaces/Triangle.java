package interfaces;

    public class Triangle {
        private double a;
        private double b;
        private double hypotenuse;

        public Triangle(double a, double b, double hypotenuse) {
            this.a = a;
            this.b = b;
            this.hypotenuse = Math.sqrt(Math.pow(a,a) + Math.pow(b,b));
        }





        public double getArea() {
            return (a * b) / 2;
        }

        public double getPerimeter() {
            return a + b + hypotenuse;
        }
    }

