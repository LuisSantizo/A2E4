import java.util.Random;
import java.util.Scanner;

public class A2E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definir variables
        int Muestra;
        int MenorEdad = 18;
        int MayorEdad = 0;

        //hacer una funcion que recorra la edad de las 20 personas
        for (int i = 0; i < 20; i++) {

            //generar numero al azar
            Random Aleatoreo = new Random();
            Muestra = Aleatoreo.nextInt(80) + 1;

            //psar los datos por condiciones para ver si son mayore o menores 
            if (Muestra >= 18) {
                System.out.println(Muestra + " Mayor de edad");
                if (MayorEdad < Muestra) {
                    MayorEdad = Muestra;
                }
            } else {
                System.out.println(Muestra + " Menor de edad");
                if (MenorEdad > Muestra) {
                    MenorEdad = Muestra;
                }
            }
        }
        System.out.println("\n\nLa persona con mayor edad es de: " + MayorEdad + " año");
        System.out.println("La persona con menor edad es de: " + MenorEdad + " año");
    }

}
