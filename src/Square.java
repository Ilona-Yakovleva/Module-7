public class Square extends Figure implements Calculation, Diagonal{
    public Square (int a) {
        sideA = a;
    }

    @Override
    public String toString() {
        return "Square:\n"+"Side A = " + this.sideA;
    }

    @Override
    public void area() {
        System.out.println("Area: " + sideA*sideA);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + sideA*4);
    }

    @Override
    public void diagonal() {
        System.out.println("Diagonal: " + sideA/Math.sin(Math.toRadians(45)));
    }
    @Override
    public void printFormula() {
        System.out.println("Area formula: side^2\nPerimeter formula: side * 4");
    }
}
