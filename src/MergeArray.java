import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];

        for (int i = 0;i<array1.length;i++){
            System.out.print("Enter element " + (i+1) + " at array1: ");
            array1[i] = sc.nextInt();
        }

        for (int i = 0;i<array2.length;i++){
            System.out.print("Enter element " + (i+1) + " at array1: ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0;i<array1.length;i++){
            array3[i] = array1[i];
        }
        for (int i = 0;i<array2.length;i++){
            array3[i+3] = array2[i];
        }
        System.out.println("array1: ");
        for (int array:array1){
            System.out.print(array + " ");
        }
        System.out.println("array2: ");
        for (int array:array1){
            System.out.print(array + " ");
        }
        System.out.println("array2: ");

        for (int array:array3){
            System.out.print(array + " ");
        }
    }
}
