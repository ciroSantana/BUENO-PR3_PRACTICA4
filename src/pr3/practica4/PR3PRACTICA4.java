package pr3.practica4;

import java.util.Scanner;

public class PR3PRACTICA4 {

    public static void main(String[] args) {

        Vector vector = GeneraVector.generaVectorAleatorio(50, 200);
        System.out.println("Contenido del vector: " + vector.dameTamaño());
        vector.mostrarVector(false, false);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduzca un umbral: ");
            float numero = (float) scanner.nextFloat();
            if (vector.contiene(numero)) {
                System.out.println("Umbral introducido correcto");
                OperacionesVector.buscaMenores(vector, (float) 37.52);
                System.out.println("Los menores obtenidos son: ");
                vector.mostrarVector(true, false);
                System.out.println("Los menores obtenidos ordenados son: ");
                vector.mostrarVector(true, true);

            } else {
                System.out.println("El número no está contenido en el vector. Inserte un umbral válido. ");
            }
            System.out.println("");
        }

    }

}
