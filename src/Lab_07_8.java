import java.util.Scanner;
public class Lab_07_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double fahrenheit = 0.0;

            do {
                System.out.print("Enter temperature in Fahrenheit: ");
                try {
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input. Please enter a valid number.");
                }
            } while (true);

            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.1f\u00B0F = %.1f\u00B0C", fahrenheit, celsius);
        }

}


