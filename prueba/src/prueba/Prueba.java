/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Alejandro_Sailema
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner tec=new Scanner(System.in);
         String nombre;
	float codigo;
	float  precio;
        float tipo;

        
                System.out.print("ingrese el nombre del producto: ");
                nombre=tec.nextLine();
                System.out.print("ingrese el codigo: ");
                codigo=tec.nextFloat();
                 System.out.print("ingrese el presio: ");
                precio=tec.nextFloat();
                 System.out.print("ingrese el tipo: ");
                tipo=tec.nextFloat();
int op;
     do{
        System.out.println("--------------Menu--------------");
        System.out.println("1. Añadir");
        System.out.println("2. Modificar");
        System.out.println("3. Buscar");
        System.out.println("4. Eliminar");
        System.out.println("5. salir");
        System.out.println("elija la opcion: ");
        op=tec.nextInt();   
        if(op==2){
            System.out.println("Añade un nuevo producto:");
        }
        if(op==3){
                   System.out.println("mdifique: ");
        }
        if(op==4){
            System.out.println("eliminar: ");
        }
       if(op==5){
            System.out.println("Salir:");
        }
       
        }while(op!=5);}
}