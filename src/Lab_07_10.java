public class Lab_07_10 {
    public static void main(String[] args) {

        System.out.print("  |");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-----------------------------------------------------");

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

