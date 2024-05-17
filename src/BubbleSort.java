public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca array[j] e array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se nenhum elemento foi trocado, a lista está ordenada
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array Original:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        bubbleSort(array);
        
        System.out.println("Array Ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
