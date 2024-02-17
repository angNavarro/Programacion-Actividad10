import java.util.Scanner;

/**
 *
 * @author angNavarro
 */
public class TestTriangle {
    public static void main(String[] args) {
        double cateto1;
        double cateto2;
        double hipotenusa;

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introduïx la mesura del primer catet: ");
        cateto1 = teclat.nextDouble();
        System.out.print("Introduïx la mesura del segon catet: ");
        cateto2 = teclat.nextDouble();
        System.out.print("Introduïx la mesura de la hipotenusa: ");
        hipotenusa = teclat.nextDouble();

        try {
            @SuppressWarnings("unused")
            Triangle Triangle = new Triangle(cateto1, cateto2, hipotenusa);
            System.out.print("\nEl triangle és correcte");
        } catch (TriangleImposibleException e) {
            System.out.println(e.getMessage());
        }

        teclat.close();
    }
}
