/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.actividades;

 import java.util.Scanner;
 
 /**
  *
  * @author pavel
  */
 public class rectángulo {
 
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el ancho del rectángulo: ");
             double ancho = scanner.nextDouble();
             System.out.print("Ingresa la altura del rectángulo: ");
             double altura = scanner.nextDouble(); 
             double area = ancho*altura;
             System.out.print("El área del rectángulo es: " + area);
        }
                
     }
 }