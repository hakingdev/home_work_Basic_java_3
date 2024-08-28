import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Количество USD = " + converter());
    }

    public static double converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество евро для конвертирования в USD: ");
        double input = scanner.nextDouble();
        double priceUSD = 1.1128;
        double result = priceUSD * input;
        return result;
    }
}
