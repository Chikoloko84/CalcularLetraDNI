package PracticasBasicas;

public class ObtenerDNI {

    // Declaramos una variable tipo String para almacenar el número del DNI
    private String numDNI="";
    // Declaramos una variable de tipo entero para pasar a número lo que
    // el usuario introduce por teclado que necesariamente debe ser un núermo
    private int numeroDNI=0;
    
    // Declaramos un array de caracteres tipo char
    private char [] letrasDNI={'T','R','W','A','G', 'M','Y','F','P','D','X'
            ,'B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public ObtenerDNI(String numeroDNI){
        
        // Le pasamos por parámetro al constructor de la clase lo que el
        // usuario introduce por teclado.
        this.numDNI=numeroDNI;
    }
    
    public int getNumDNI(){
        
        try{
            // Si lo que el usuario introduce se puede transformar en númérico
            // se salta el catch por lo tanto devolverá el número del DNI,
            // el cual dividiremos entre 23 y almacenaremos el resto en la
            // variable llamada numeroDNI a la cual le reasignaremos el valor.
            this.numeroDNI= Integer.parseInt(numDNI);
            
            // Dividimos el número introducido por el usuario entre 23
            // y obtenemos el resto de la division.
            this.numeroDNI=(this.numeroDNI%23);
        }
        catch (NumberFormatException e){
            // Si no se puede tranformar en entero se ejecuta el catch
            // por lo que devolverá -1
            return -1;
        }
        // Si todo es correcto, devolverá el número del DNI
        return this.numeroDNI;
    }
    
    // Sobreescribimos el método toString de la clase Object

    @Override
    public String toString() {
        
        // Devolvemos el número del DNI y la letra correspondiente.
        return this.numDNI + this.letrasDNI[numeroDNI];
    }
}