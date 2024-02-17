/**
 *
 * @author angNavarro
 */
public class Triangle {
    double cateto1 = 0;
    double cateto2 = 0;
    double hipotenusa = 0;

    public Triangle(double cateto1, double cateto2, double hipotenusa) throws TriangleImposibleException {
        if (cateto1 + cateto2 <= hipotenusa || cateto1 + hipotenusa <= cateto2 || cateto2 + hipotenusa <= cateto1) { // Definicion
            throw new TriangleImposibleException(
                    "\nTriangle impossible: La suma de dos costats del triangle sempre ha de ser major que la mesura del tercer costat.");
        }

        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;

    }

}