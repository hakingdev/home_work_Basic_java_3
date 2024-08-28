import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое словое: ");
        String firstWord = scanner.nextLine();
        while(firstWord.length() % 2 != 0){
            System.out.println("Введите четное количество символов: ");
            firstWord = scanner.nextLine();
        };
        firstWord = firstWord.substring(0, firstWord.length() / 2);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе словое: ");
        String secondWord = scanner2.nextLine();
        while(secondWord.length() % 2 != 0){
            System.out.println("Введите четное количество символов: ");
            secondWord = scanner.nextLine();
        };
        secondWord = secondWord.substring(secondWord.length() / 2);;
        System.out.println("Сумма двух слов: " + firstWord + secondWord);
    }
}
