/**
 *
 * @author angNavarro
 */
public class Triangle {
    double cateto1 = 0;
    double cateto2 = 0;
    double hipotenusa = 0;

    public Triangle(double cateto1, double cateto2, double hipotenusa) throws TriangleImposibleException {
        if (cateto1 + cateto2 <= hipotenusa) { // Definicion caso 1
            throw new TriangleImposibleException(
                    "\nTriangle impossible: La suma de dos catetos del triangle sempre ha de ser major que la hipotenusa.");
        }
        if (cateto1 + hipotenusa <= cateto2) { // Definicion caso 2
            throw new TriangleImposibleException(
                    "\nTriangle impossible: La suma del primer catet i la hipotenusa ha de ser major que el segon catet");
        }

        if (cateto2 + hipotenusa <= cateto1) { // Definicion caso 3
            throw new TriangleImposibleException(
                    "\nTriangle impossible: La suma del segon catet i la hipotenusa ha de ser major que el primer catet");

        }

        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }
}
