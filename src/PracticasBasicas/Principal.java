package PracticasBasicas;

import javax.swing.JOptionPane;

public class Principal {
    
    // Declaramos una variable para almacenar lo que se le pide al usuario
    private static String numeroDNI="";
    
    // Declaramos una variable para crear una instancia de la clase ObtenerDNI
    private static ObtenerDNI dni=null;
    
    public static void main(String[] args) {
        numeroDNI= JOptionPane.showInputDialog(null,
                "Introduce el número del DNI sin la letra");
        
        // Instanciamos la clase ObtenerDNI, pasandole por parametro en el
        // constructor el valor que introdujo el usuario y que, está guardado
        // en la variable numeroDNI.
        dni = new ObtenerDNI(numeroDNI);
        
        // Si el valor del dni, no devuelve -1,
        //quiere decir que el valor del DNI es correcto
        if(dni.getNumDNI() != -1){
            System.out.println("El DNI es: " + dni.toString());
        }
        else{
            System.out.println("El número del DNI es incorrecto.");
        }  
    }
}