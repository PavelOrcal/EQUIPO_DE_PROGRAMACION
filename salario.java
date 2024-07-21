import java.util.Scanner;

public class salario {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);


     System.out.println("ingresa el salario bruto mensual");
     double salarioBruto = scanner.nextDouble ();


     System.out.println("ingresa el porcentaje de impuestos");
     double porcentaje = scanner.nextDouble();
     
     System.out.println("ingresa las deducciones adicionales");
     double deducciones = scanner.nextDouble();


     double impuestos = (salarioBruto * porcentaje) / 100;

     double salario = salarioBruto - impuestos - deducciones;

     System.out.printf("el salario Neto es: %.2f%n", salario);
 }
    
}
