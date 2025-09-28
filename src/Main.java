import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    double celsius = 0.0;
    double fahrenheit = 0.0;
    boolean done = false;

    do {
        System.out.println("Enter a temperature in Celsius: ");
        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            fahrenheit = celsius * (9.0/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            done = true;
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            in.nextLine();
        }
    }while (!done);

    in.close();
    }
}