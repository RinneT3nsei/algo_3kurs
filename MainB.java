import java.util.Arrays;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int first = scanner.nextInt();

        System.out.println("Введіть друге число");
        int second = scanner.nextInt();

        int[] denominatorsFirst = denominators(first);
        int[] denominatorsSecond = denominators(second);

        System.out.println("Подільники першого числа : " + Arrays.toString(denominatorsFirst));
        System.out.println("Подільники першого числа, які є взаємопростими з другим числом");

        for (int el : denominatorsFirst){
            if (intersectionArrays(denominators(el), denominatorsSecond).length == 0){
                System.out.println(el);
            }
        }

    }
    // перетин двох масивів
    public static int[] intersectionArrays(int[] firstArray, int[] secondArray){
        int[] intersection = new int[0];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]){
                    intersection = addToArray(intersection, secondArray[j]);
                }
            }
        }
        return intersection;
    }
    // дільники числа
    public static int[] denominators(int decimal){
        int[] denominators = new int[0];
        for (int i = 2; i <= decimal; i++) {
            if (decimal % i == 0){
                denominators = addToArray(denominators, i);
            }
        }
        return denominators;
    }

    public static int[] addToArray(int[] array, int el){
        int[] biggerArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            biggerArray[i] = array[i];
        }
        biggerArray[biggerArray.length - 1] = el;
        return biggerArray;
    }
}