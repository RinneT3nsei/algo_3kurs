import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Enter size binary tree: ");
        int size = scanner.nextInt();
        System.out.println("values : ");
        for (int i = 0; i < size; i++) {
            binaryTree.add(scanner.nextInt());
        }
        System.out.println("Element for search count branch between root and el : ");
        int el = scanner.nextInt();
        System.out.println(binaryTree.lengthBinaryTree(el));
    }

}
