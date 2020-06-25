/**
 * Evaluacion de Numeros Primos
 * Los números primos son aquellos que solo son divisibles entre ellos mismos y el 1.
 * @version     v0.1 05/04/2020
 * @author      Fernando Gutierrez
 */

public class Primos {
    int contador;       // cantidad de divisores
    int numero;         // numero ingresado
    boolean resultado;  // resultado que retorna el metodo evaluacion

    public Primos(){
        // Metodo Constructor
        contador = 0;
        numero = 0;
    }

    public boolean evaluacion(int numero){
        // Metodo para evaluar el numero si es Primo

        //System.out.println("Numero evaluado: ");
        //numero = Leer.datoInt();
        contador = 0;


        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador = contador + 1;
            }
        }

        if (contador == 2) {
            resultado = true;                   /* es numero primo */
            System.out.println(resultado);
        } else {
            resultado = false;                  /* no es numero primo */
            System.out.println(resultado);
        }

        return resultado;
    }
}