import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число : ");
        double decimal = scanner.nextDouble() ;
        if (decimal - (int) decimal == 0){
            System.out.println("Введений рядок є цілим числом");
        } else {
            System.out.println("Введений рядок не є цілим числом");
        }
    }
}