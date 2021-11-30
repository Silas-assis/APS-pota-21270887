import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Ordena ordena = new Ordena();

        int[] vetorOriginal = new int[5];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = (int) (Math.random() * vetorOriginal.length);
        }

        System.out.println("");

        ordenaBubbleSort(ordena, vetorOriginal);

        ordenaInsertionSort(ordena, vetorOriginal);

        ordenaSelectionSort(ordena, vetorOriginal);

        ordenaQuickSortCrescente(ordena, vetorOriginal);

        ordenaQuickSortDecrescente(ordena, vetorOriginal);

    }

    /*
     * Método Quick Sort em modo Decrescente.
     */
    private static void ordenaQuickSortDecrescente(Ordena ordena, int[] vetorOriginal) {
        imprimirVetorOriginal(vetorOriginal);

        int[] vetorAuxQuickDecrescente = vetorOriginal;

        ordena.quickSort(vetorAuxQuickDecrescente, Ordena.Tipo.DECRESCENTE);

        System.out.println("Ordenação Quick Sort Decrescente: ");
        for (int i = 0; i < vetorAuxQuickDecrescente.length; i++) {
            System.out.print(vetorAuxQuickDecrescente[i] + " ");
        }
        System.out.println(" ");
        // System.out.println("Comparações Bubble Sort: " +
        // ordena.getCountComparacoes());
        System.out.println("-------------------------");
    }

    /*
     * Método Quick Sort em modo Crescente.
     */
    private static void ordenaQuickSortCrescente(Ordena ordena, int[] vetorOriginal) {
        imprimirVetorOriginal(vetorOriginal);

        int[] vetorAuxQuickCrescente = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        ordena.quickSort(vetorAuxQuickCrescente, Ordena.Tipo.CRESCENTE);

        System.out.println("Ordenação Quick Sort Crescente: ");
        for (int i = 0; i < vetorAuxQuickCrescente.length; i++) {
            System.out.print(vetorAuxQuickCrescente[i] + " ");
        }
        System.out.println(" ");
        // System.out.println("Comparações Bubble Sort: " +
        // ordena.getCountComparacoes());
        System.out.println("-------------------------");
    }

    /*
     * Método Selection Sort.
     */
    private static void ordenaSelectionSort(Ordena ordena, int[] vetorOriginal) {
        imprimirVetorOriginal(vetorOriginal);

        int[] vetorAuxSelection = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        ordena.selectionSort(vetorAuxSelection);

        System.out.println("Ordenação Selection Sort: ");
        for (int i = 0; i < vetorAuxSelection.length; i++) {
            System.out.print(vetorAuxSelection[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Comparações Selection Sort: " +ordena.getCountComparacoes());
        System.out.println("-------------------------");
    }

    /*
     * Método Insertion Sort.
     */
    private static void ordenaInsertionSort(Ordena ordena, int[] vetorOriginal) {
        imprimirVetorOriginal(vetorOriginal);

        int[] vetorAux = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        ordena.insertionSort(vetorAux);

        System.out.println("Ordenação Insertion Sort: ");
        for (int i = 0; i < vetorAux.length; i++) {
            System.out.print(vetorAux[i] + " ");
        }
        System.out.println(" ");
        // System.out.println("Comparações Bubble Sort: " + ordena.getCountComparacoes());
        System.out.println("-------------------------");
    }

    /*
     * Método Bubble Sort.
     */
    private static void ordenaBubbleSort(Ordena ordena, int[] vetorOriginal) {

        imprimirVetorOriginal(vetorOriginal);

        int[] vetorAuxBubble = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        ordena.bubbleSort(vetorAuxBubble);

        System.out.println("Ordenação Bubble Sort: ");
        for (int i = 0; i < vetorAuxBubble.length; i++) {
            System.out.print(vetorAuxBubble[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Comparações Bubble Sort: " + ordena.getCountComparacoes());
        System.out.println("-------------------------");
    }

    private static void imprimirVetorOriginal(int[] vetorOriginal) {
        System.out.println("Vetor Original:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }
        System.out.println(" ");
    }
}
