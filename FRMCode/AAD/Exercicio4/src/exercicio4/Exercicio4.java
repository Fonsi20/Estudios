/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;
import Obx.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.hibernate.*;

/**
 *
 * @author a18franciscorm
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MetodosSQL msql=new MetodosSQL();
        Metodos m1= new Metodos();
        Session s= null;
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        while(opcion!=6){
            opcion=m1.menuPrincipal();
            switch(opcion){
                case 1:s=m1.conectar();
                break;
                case 2:m1.switchInsert(s);
                break;
                case 3:m1.switchDelete(s);
                break;
                case 4:m1.switchUpdate(s);
                break;
                case 5:m1.switchQuery(s);
                break;
            }
        }
        System.out.println("Saindo, Adeus");
        m1.desconectar(s);
        
        /*
        MENÚ
        3- Borrado de filas.
            a. Borrado libro(El autor sigue existiendo).
            b. Borrado autor(Desaparecen todos los libros).
            c. Borrado teléfono
        4-Modificaciones.
            - Introduciendo el código de un libro modifique su precio.
            -partiendo de un autor modificar el nº de tf.	
        6- Consultas.
            a. Introduciendo el título de un libro visualice sus datos  
                y el nombre el autor ó autores con su tf.
            b. Introduciendo el nombre de un autor visualice sus libros.
            c. Visualización de todos los Libros de la tabla.
            d.Visualización  de todos los autores con sus libros.
        facer os sessions

        */
    }
    
}
