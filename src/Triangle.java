public class Triangle extends Figure implements Calculation{
    public Triangle(int a, int b, int c, int an) {
        sideA = a;
        sideB = b;
        sideC = c;
        angle = an;
    }
    @Override
    public String toString() {
        return "Triangle:\n"+"Side A = " + this.sideA + "\n" +
                "Side B = " + this.sideB + "\n" +
                "Side C = " + this.sideC + "\n" +
                "Angle = " + this.angle;
    }
    @Override
    public void area() {
        System.out.println("Area:" + sideA*sideB*Math.sin(Math.toRadians(angle))/2);
    }
    @Override
    public void perimeter() {
        System.out.println("Perimeter:" + (sideB+sideA+sideC));
    }
    @Override
    public void printFormula() {
        System.out.println("Area formula: side a * side b * sin C / 2\nPerimeter formula: side a + side b + side c");
    }
}
