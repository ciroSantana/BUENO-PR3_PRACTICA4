package pr3.practica4;

public class PR3PRACTICA4 {

    public static void main(String[] args) {
        
        Vector vector = GeneraVector.generaVectorAleatorio(50,200);
        
        float numero = (float) 37.52;
        if (OperacionesVector.estaContenido(vector, numero)) {
            
            OperacionesVector.buscaMenores(vector, (float) 37.52);
        }
        
        
        
    }
    
}
