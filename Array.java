
/**
 *  
 * @author Angel Aldarias
 * La excepcion se captura debidamente y es imprimido el mensaje
 */

import java.util.Random;;

public class Array {
    public static void main(String[] args) {

        int[] arrayElements = new int[100];
        Random numeroRandom = new Random();
        int indiceArray = 0;

        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = numeroRandom.nextInt(500);// limite
        }

        for (int i = 0; i < 10; i++) { // 10 indicies
            indiceArray = numeroRandom.nextInt(201) - 50;// limtes

            // Excepcion
            try {
                System.out.println(
                        "El valor de l'array a la posició " + indiceArray + "  es: " + arrayElements[indiceArray]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("L'índex " + indiceArray + " no pertany a l'array");
            }
        }
    }
}
