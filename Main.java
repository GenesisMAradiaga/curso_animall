/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.curso_de_rescate_animal.newpackage;
import com.mycompany.curso_de_rescate_animal.utilidades.Layout;
import java.util.Scanner;
/**
 *
 * @author Genesis Maradiaga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Layout.printSeparator();
        //System.out.println("Musica App V1.0");
        //Layout.printSeparator();
        Layout.printHeader("Cursos de Rescate Animal App");
        String OpcionMenu = "";
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        Aplicacion cursoApp = new Aplicacion(entradaTeclado);
        
        while (!(OpcionMenu.toUpperCase().equals("S"))) {
            Layout.printMenu();
            OpcionMenu = entradaTeclado.nextLine();

            System.out.println("Texto ingresado es igual a " + OpcionMenu);
            // Verificar las Opciones
            cursoApp.activarEvento(OpcionMenu);
            
        }
    }
    
}
