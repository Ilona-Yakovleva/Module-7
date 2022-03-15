import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.newFile();

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm");
        System.out.println(dateFormat.format(calendar.getTime()) + "\n");

        Figure figures[] = new Figure[4];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(3,4,5, 90);
        figures[2] = new Rectangle(6,8);
        figures[3] = new Square(7);

        for (Figure f: figures) {
            System.out.println(f);
            f.printFormula();
            ((Calculation) f).area();
            ((Calculation) f).perimeter();
            if (f instanceof Diagonal) ((Diagonal) f).diagonal();
            System.out.println("___________________________________\n");
        }

    }
}
