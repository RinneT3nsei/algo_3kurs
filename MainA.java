import java.util.ArrayDeque;
import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        ArrayDeque<Integer> sortArrayDeque = new ArrayDeque<>();
        System.out.println("Введіть кількість елементів : ");
        int countElements = scanner.nextInt();
        System.out.println("Введіть значення : ");
        for (int i = 0; i < countElements; i++) {
            arrayDeque.add(scanner.nextInt());
        }
        System.out.println("Вхідна черга : " + arrayDeque.toString());
        for (int el : arrayDeque){
            if (el >= 0){
                sortArrayDeque.addFirst(el);
            }
            else {
                sortArrayDeque.addLast(el);
            }
        }
        System.out.println("Перебудована черга : " + sortArrayDeque.toString());
    }
}
