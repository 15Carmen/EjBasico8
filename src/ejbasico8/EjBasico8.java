package ejbasico8;

import java.util.Scanner;

public class EjBasico8 {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables nombre y edad
        String nombre;
        int edad;

        /**
         * Le preguntamos al usuario cual es su nombre y cual es su edad y
         * guardamos las respuestas en las variables correspondientes
         */
        System.out.println("¿Cómo te llamas?");
        nombre=sc.next();
        System.out.println("¿Cúantos años tienes?");
        edad=sc.nextInt();

        //Mostramos por pantalla las variables
        System.out.println("Hola "+nombre+", tienes "+edad+" años, ¡qué mayor eres!");

    }
}
