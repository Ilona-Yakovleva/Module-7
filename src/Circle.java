public class Circle extends Figure implements Calculation{
    public Circle(int r) {
        radius = r;
    }
    @Override
    public String toString() {
        return "Circle:\n" + "Radius = " + this.radius;
    }
    @Override
    public void area() {
        System.out.println("Area:" + radius*radius*Math.PI);
    }
    @Override
    public void perimeter() {
        System.out.println("Length of Circle:" + radius*2*Math.PI);
    }
    @Override
    public void printFormula() {
        System.out.println("Area formula: PI*R^2\nPerimeter formula: 2*PI*R");
    }
}
