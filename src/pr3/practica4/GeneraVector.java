package pr3.practica4;

public class GeneraVector {

    public static Vector generaVectorAleatorio(int min, int max) {
        
        int tamaño = obtenerTamañoAleatorio(min, max);
        float[] vector = new float[tamaño];
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < tamaño; i++) {
            vector[i] = r.nextFloat();
        }
        return new Vector(vector);
    }
    
    private static int obtenerTamañoAleatorio(int min, int max) {
        while (true) {
            java.util.Random random = new java.util.Random();
            int tamañoAleatorio = random.nextInt(max);
            if (tamañoAleatorio >= min) return tamañoAleatorio;
        }
    }
    
}
