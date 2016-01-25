/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import model.Alumno;

/**
 *
 * @author alum.fial8
 */
public class Principal {
    static Alumno a1;
    static Numero n1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        agregar();
        
    }
    public static void agregar(){
        a1 = new Alumno("Reyna","Maria",17,"La Alameda");
        System.out.println("Datos de Alumno");
        System.out.println("________________");
        System.out.println(a1.getApellidos()+" "+a1.getNombres()+" "+a1.getEdad());
    }
    
}
