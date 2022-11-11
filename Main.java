import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sizeArray = 0;

        System.out.println("Enter size first array");
        sizeArray = scanner.nextInt();
        int[] firstArray = new int[sizeArray];
        
        for(int i = 0; i < firstArray.length; i++){
            firstArray[i] = random.nextInt(10);
        }
        bubbleSort(firstArray);

        System.out.println("Enter size second array");
        sizeArray = scanner.nextInt();
        int[] secondArray = new int[sizeArray];
        
        for(int i = 0; i < secondArray.length; i++){
            secondArray[i] = random.nextInt(10);
        }
        bubbleSort(secondArray);
        
        System.out.print("First array : ");
        System.out.println(Arrays.toString(firstArray));
        System.out.print("Second array : ");
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Elements only in first array");
        System.out.println(Arrays.toString(elementsOnlyFirstArray(firstArray, secondArray)));
    }
    public static int[] elementsOnlyFirstArray(int[] firstArray, int[] secondArray){
        int[] resultArray = new int[0];
        for (int el : firstArray){
            if (!elementInArray(secondArray, el)){
                resultArray = addToArray(resultArray, el);
            }
        }
        return resultArray;
    }
    public static boolean elementInArray(int[] array, int searchElement){
        for(int el : array){
            if(el == searchElement){
                return true;
            }
        }
        return false;
    }

    public static int[] addToArray(int[] array, int el){
        int[] biggerArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++){
            biggerArray[i] = array[i];
        }
        biggerArray[biggerArray.length - 1] = el;
        return biggerArray;
    }
     public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }
            }  
        }  
    }  
}