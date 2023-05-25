import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        System.out.println("Podaj imie kobiety:");
        final String name = scanner.next();
        System.out.println("Cześć " + name +" jak bardzo mnie lubisz od 1 do 100?");
        final Integer integer = scanner.nextInt();
        if(integer <= 10) {
            System.out.println("No stary tak chujowo");
        } else if (integer <= 50) {
            System.out.println("No stary tak pół na pół");
        } else if (integer <= 75) {
            System.out.println("Stary dajesz lecisz oby tak dalej");
        } else if (integer == 100) {
            System.out.println("Stary ona jest twoja");
        } else if (integer > 100) {
            System.out.println("<3");
        }
    }
}
