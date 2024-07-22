import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        String texto = "";

        do
        {
            System.out.print("Ingrese una letra o un espacio para terminar: ");
            texto = a.nextLine();

            if (texto.equals(" ")) {
                System.out.println("Programa terminado.");
            } 
            else 
            {
                char letra = texto.charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("La letra '" + letra + "' es una vocal.");
                } else {
                    System.out.println("La letra '" + letra + "' es una consonante.");
                }
            }
        }
        while (texto.equals(" ") == false);

        a.close();
    }
}
