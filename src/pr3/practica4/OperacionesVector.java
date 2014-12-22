package pr3.practica4;

import java.util.Random;

public class OperacionesVector {

    static void buscaMenores(Vector vector, float valor) {

        vector.setPosicion(buscaMenoresRec(vector.dameArray(), 0, vector.dameTamaño() - 1, valor));
        vector.obtenerMenoresOrdenado();

    }

    private static int buscaMenoresRec(float[] vector, int linf, int lsup, float valor) {
        if (linf > lsup) {
            return 0;
        }
        if (linf == lsup) {
            return linf;
        }

        int[] posiciones = Division(vector, linf, lsup);

        if (vector[posiciones[0] + 1] > valor) {
            return buscaMenoresRec(vector, linf, posiciones[0], valor);
        }
        if (vector[posiciones[0] + 1] < valor) {
            return buscaMenoresRec(vector, posiciones[1], lsup, valor);
        }
        return 0;
    }

    private static int[] Division(float[] vector, int linf, int lsup) {

        int piv = obtenerPivote(linf, lsup);

        int pini = linf, pfin = lsup;

        float aux;
        while (pini <= pfin) {

            while (pini <= lsup && vector[pini] <= vector[piv]) {
                pini++;
            }

            while (pfin >= linf && vector[pfin] >= vector[piv]) {
                pfin--;
            }

            if (pini < pfin) {
                aux = vector[pini];
                vector[pini] = vector[pfin];
                vector[pfin] = aux;

                pini++;
                pfin--;
            }
        }

        if (pini < piv) {
            aux = vector[pini];
            vector[pini] = vector[piv];
            vector[piv] = aux;
            pini++;
        } else if (pfin > piv) {
            aux = vector[pfin];
            vector[pfin] = vector[piv];
            vector[piv] = aux;
            pfin--;
        }
        int[] v2 = {pfin, pini};
        return v2;
    }

    private static int obtenerPivote(int linf, int lsup) {
        java.util.Random random = new Random();

        while (true) {
            int aux = random.nextInt(lsup);

            if (aux >= linf) {
                return aux;
            }

        }

    }

    static boolean estaContenido(Vector vector, float numero) {
        return vector.contiene(numero);
    }

    
    
    
    
    
    private static void mostrarResultadoDivision(float[] vector, int pivote) {

        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                System.out.print(vector[i] + "(" + i + ")" + ", ");
            } else {
                System.out.println(vector[i] + "(" + i + ")");
            }
        }

        compruebaDivision(vector, pivote);
    }

    private static void compruebaDivision(float[] vector, int pivote) {
        System.out.println("____________________________________");
        boolean error = false;

        System.out.println("Comprobar menores: (PIVOTE = " + pivote + ")");

        for (int i = 0; i < pivote; i++) {
            if (vector[i] > vector[pivote + 1]) {
                error = true;
                System.out.println("Problema en la posición (" + i + ").");
            }
        }
        if (!error) {
            System.out.println("No hay errores en los menores");
        }

        System.out.println("Comprobar mayores: (PIVOTE = " + pivote + ")");
        error = false;
        for (int i = pivote; i < vector.length; i++) {
            if (vector[i] < vector[pivote - 1]) {
                error = true;
                System.out.println("Problema en la posición (" + i + ").");
            }
        }
        if (!error) {
            System.out.println("No hay errores en los mayores");
        }
        System.out.println("____________________________________");

    }
}
