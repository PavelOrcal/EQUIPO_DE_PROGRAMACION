import java.util.Scanner;
  
 public class INFO {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 'artista', 'película', 'serie', 'libro' o 'videojuego' para obtener información:");
        String userInput = scanner.nextLine().trim().toLowerCase();

        String result;

        switch (userInput) {
            case "artista":
                result = getArtistInfo();
                break;
            case "película":
                result = getMovieInfo();
                break;
            case "serie":
                result = getSeriesInfo();
                break;
            case "libro":
                result = getBookInfo();
                break;
            case "videojuego":
                result = getGameInfo();
                break;
            default:
                result = "Opción no válida. Por favor, elige entre 'artista', 'película', 'serie', 'libro' o 'videojuego'.";
                break;
        }

        System.out.println(result);
    }
    private static String getArtistInfo() {
        return "Artista: Taylor Swift\nDescripción: Cantante y compositora estadounidense de música pop y country.";
    }
    private static String getMovieInfo() {
        return "Película: Inception\nDescripción: Película de ciencia ficción dirigida por Christopher Nolan.";
    }

    private static String getSeriesInfo() {
        return "Serie: Breaking Bad\nDescripción: Serie de televisión sobre un profesor de química convertido en fabricante de metanfetaminas.";
    }

    private static String getBookInfo() {
        return "Libro: Cien años de soledad\nDescripción: Novela escrita por el autor colombiano Gabriel García Márquez.";
    }

    private static String getGameInfo() {
        return "Videojuego: The Legend of Zelda: Breath of the Wild\nDescripción: Videojuego de acción y aventura desarrollado por Nintendo.";
    }

    }
 