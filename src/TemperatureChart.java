public class TemperatureChart {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Celsius", "Fahrenheit");
        for (double celsius = 0.0; celsius <= 100.0; celsius += 1.0) {
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("%-10.2f%-10.2f\n", celsius, fahrenheit);
        }
    }
}

