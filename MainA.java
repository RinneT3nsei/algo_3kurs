import java.util.Arrays;

public class MainA {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] firstArr = new int[]{1, 2, 2, 3, 4, 25};
        System.out.println(Arrays.toString(firstArr));
        int elementForSearch = 25;
        System.out.println("Елемент для пошуку " + elementForSearch);
        long startTime = System.nanoTime();
        System.out.println(binarySearch(firstArr,elementForSearch,0,firstArr.length - 1));
        System.out.println("Час виконання звичайного бінарного пошуку " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        System.out.println(interpolationSearch(firstArr, 25));
        System.out.println("Час виконання модифікованого бінарного пошуку " + (System.nanoTime() - startTime));

        int[] secondArr = new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(secondArr));
        elementForSearch = 3;
        System.out.println("Елемент для пошуку " + elementForSearch);
        startTime = System.nanoTime();
        System.out.println(binarySearch(secondArr,elementForSearch,0,secondArr.length - 1));
        System.out.println("Час виконання звичайного бінарного пошуку " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        System.out.println(interpolationSearch(secondArr, 3));
        System.out.println("Час виконання модифікованого бінарного пошуку " + (System.nanoTime() - startTime));

    }

    public static int binarySearch(int[] arr, int key, int first, int last){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }

    public static int interpolationSearch(int[] data, int item) {

        int highEnd = (data.length - 1);
        int lowEnd = 0;

        while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {

            int probe
                    = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);

            if (highEnd == lowEnd) {
                if (data[lowEnd] == item) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (data[probe] == item) {
                return probe;
            }

            if (data[probe] < item) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }

}