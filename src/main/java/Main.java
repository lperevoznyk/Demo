import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scan values from console
        Scanner console = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = console.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value: ");
            myArray[i] = console.nextInt();
        }

        for (int x : myArray) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();
        //================================================


        //Swap minimum and maximum values in array.
        int[] array = {19, -2, -8, 7, 9, -10, -5, 3};
        for (int x : array) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();

        int max = array[0];
        int indexOfMax = 0;
        int min = array[0];
        int indexOfMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }

        int temp = array[indexOfMax];
        array[indexOfMax] = array[indexOfMin];
        array[indexOfMin] = temp;

        for (int x : array) {
            System.out.print("[" + x + "] ");
        }
        System.out.println();
    }
}

