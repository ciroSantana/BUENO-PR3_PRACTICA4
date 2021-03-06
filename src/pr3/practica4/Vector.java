package pr3.practica4;

import java.util.Random;

public class Vector {
    private float[] v, menoresOrdenado;
    private int posicion;
    
    public Vector(float[] vector) {
        v = vector;
    }
    
    void establecerPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    void establecerMenoresOrdenado(float[] vector) {
        menoresOrdenado = vector;
    }
    
    public int dameTamaño() {
        return v.length;
    }

    public float[] dameArray() {
        return v;
    }
    
    public int damePosicion() {
        return posicion;
    }

    boolean contiene(float numero) {
        for (float w : v) {
            if (w == numero) return true;
        }
        return false;  
    }
    
    public void mostrarVector(boolean menores, boolean ordenado) {
        if (menores) {
            if (ordenado) mostrarVector(menoresOrdenado, posicion);
            else mostrarVector(v, posicion);
        } else {
            mostrarVector(v, v.length);
        }
        
    }
    
    private void mostrarVector(float[] vector, int lsup) {
        for (int i = 0; i < lsup; i++) {
            if (i < lsup -1) System.out.print(vector[i] + ", ");
            else System.out.println(vector[i]);
        }
    }


    
}
