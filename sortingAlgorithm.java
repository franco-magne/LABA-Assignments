public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] array, int min_index, int max_index) {

        if (min_index < max_index) {
            int pointer = partition(array, min_index, max_index);

            quickSort(array, min_index, pointer - 1);
            printArray(array);
            System.out.println();
            quickSort(array, pointer + 1, max_index);
        }
    }

    public static int partition(int[] array, int min_index, int max_index) {
        int pivot = array[max_index]; // takes as pivot the last item from the array
        int i = (min_index - 1);

        for (int j = min_index; j < max_index; j++) {
            if (array[j] <= pivot) {
                i++;

                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        int aux = array[i + 1];
        array[i + 1] = array[max_index];
        array[max_index] = aux;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 10, 2, 7, 12, 3, 15, 1};

        System.out.println("Unordered Array: ");
        printArray(numbers);

        System.out.println("\nQuickSort Algorithm...\n");
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Ordered Array: ");
        printArray(numbers);

    }
}