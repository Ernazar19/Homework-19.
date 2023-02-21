import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet[] planet = Planet.values();
        while (true) {
            String a = new Scanner(System.in).nextLine().toUpperCase();
            switch (a) {
                case "EARTH" -> System.out.println(Planet.EARTH.getPlanet());
                case "MARS" -> System.out.println(Planet.MARS.getPlanet());
                case "SATURN" -> System.out.println(Planet.SATURN.getPlanet());
                case "MERCURY" -> System.out.println(Planet.MERCURY.getPlanet());
                case "URANUS" -> System.out.println(Planet.URANUS.getPlanet());
                case "JUPITER" -> System.out.println(Planet.JUPITER.getPlanet());
                case "VENUS" -> System.out.println(Planet.VENUS.getPlanet());
                default -> System.out.println("Мындай планета тузулгон жок");
            }
        }
    }
}
