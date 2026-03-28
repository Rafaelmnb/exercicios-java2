import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double RAIO_TERRA = 6371.01;

        System.out.print("Latitude da coordenada 1: ");
        double lat1 = Math.toRadians(sc.nextDouble());

        System.out.print("Longitude da coordenada 1: ");
        double lon1 = Math.toRadians(sc.nextDouble());

        System.out.print("Latitude da coordenada 2: ");
        double lat2 = Math.toRadians(sc.nextDouble());

        System.out.print("Longitude da coordenada 2: ");
        double lon2 = Math.toRadians(sc.nextDouble());

        double distancia = RAIO_TERRA * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        System.out.println("A distancia entre esses pontos e: " + distancia + " km");

        sc.close();
    }
}
