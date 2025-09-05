import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        double a = input.nextDouble();

        System.out.println("Geben Sie Ihre Operation ein: ");
        char operation = input.next().charAt(0);

        System.out.println("Geben Sie die zweite Zahl ein: ");
        double b = input.nextDouble();

        double result = 0.0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = b != 0 ? a / b : Double.NaN;
                break;
            default:
                System.out.println("Ungültige Operation!");
                return;
        }
        System.out.println("Ergebnis: " + result);
    }
}