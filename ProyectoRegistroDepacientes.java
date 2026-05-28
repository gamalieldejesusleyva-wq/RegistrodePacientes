/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CursoSnakes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author gamaliel
 */
class Paciente{
    int edad;
        String nombre;
        String sexo;
        String enfermedad;
}
public class ProyectoRegistoDePacientes {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         List<Paciente> lista = new ArrayList<Paciente>();
        int edad = 0;
        String nombre = "";
        String sexo = "";
        String enfermedad = "";
        int option;
        
         String menu = """
                      Registro de citas para Pacientes
                      1._ Registar paciente
                       2._ Mostrar pacientes
                       """; 
          System.out.println(menu);
        System.out.print("Selecciona una opción: ");
        option = sc.nextInt();
        sc.nextLine(); // limpiar 
        
        
        switch(option){
            case 1:
                System.out.print("Ingrese el nombre");
                nombre = sc.nextLine();
                System.out.println("Nombre: " + nombre);
                
                System.out.print( "Ingrese la edad");
                edad = sc.nextInt();
                sc.nextLine();
                System.out.println("Edad: " + edad);
                
                 System.out.print( "Ingrese genero del paciente");
                sexo = sc.nextLine();
                sc.nextLine();
                System.out.println("Gnero: " + sexo);
                
                System.out.print( "Ingrese enfermedad del paciente");
                enfermedad = sc.nextLine();
                sc.nextInt();
                System.out.println("Enfermedad: " + enfermedad);
               
                break;
            case 2:
                if()
                
                default:
                System.out.println("Opción no válida");
           
        }
        
        sc.close();
        
    }
}
