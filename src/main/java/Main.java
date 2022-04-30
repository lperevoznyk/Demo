public class Main {

    public static void main(String[] args) {

        //methods for array
        int[] inputArray;
        int[] resultArray;
        int resultArraySize = 0;
        int resultArrayCounter = 0;

        ConsoleController consoleController = new ConsoleController();

        inputArray = consoleController.getArrayFromConsole();

        consoleController.outLn("inputArray includes: ");
        consoleController.printArray(inputArray);

        for (int i : inputArray) {
            if (i > 0) {
                resultArraySize++;
            }
        }

        resultArray = new int[resultArraySize];

        for (int i : inputArray) {
            if (i > 0) {
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }

        consoleController.outLn("Result array:");
        consoleController.printArray(resultArray);

        //sorting
        int[] array = {2, 4, 6, 3, 2, -1, 0, -18}; //-18, -1, 0, 2, 2, 3, 4, 6
        sort(array);
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        new ConsoleController().printArray(array);
    }
}