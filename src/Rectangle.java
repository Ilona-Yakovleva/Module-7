public class Rectangle extends Figure implements Calculation, Diagonal{
    public Rectangle(int a, int b){
        sideA = a;
        sideB = b;
    }
    public String toString() {
        return "Rectangle:\n"+"Side A = " + this.sideA + "\n" +
                "Side B = " + this.sideB;
    }

    @Override
    public void area() {
        System.out.println("Area:" + sideA*sideB);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + (sideA+sideB)*2);
    }

    @Override
    public void diagonal() {
        System.out.println("Diagonal: " + Math.sqrt(sideA*sideA + sideB*sideB));
    }
    @Override
    public void printFormula() {
        System.out.println("Area formula: side a * side b\nPerimeter formula: (side a + side b)*2");
    }
}
