public class Ordena {
    private int countComparacoes;

    public int getCountComparacoes() {
        return countComparacoes;
    }

    public static enum Tipo {
        CRESCENTE, DECRESCENTE
    }

    /*
        Algoritmo Bubble Sort.
    */
    public void bubbleSort(int[] vetor) {
        countComparacoes = 0;

        for(int i = 0; i < vetor.length - 1; i++) {
            for(int j = 0; j < vetor.length - 1 - i; j++) {
                countComparacoes++;
              if(vetor[j] > vetor[j + 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
                }
            }
        }
    }

     /*
        Algoritmo Insertion Sort.
    */
    public void insertionSort(int[] vetor) {
        countComparacoes = 0;
        int atual;
    
        for (int i = 1; i < vetor.length; i++) {
            atual = vetor[i];
            int j = i - 1;
            countComparacoes++;
            while ((j >= 0) && (vetor[j]) > atual) {
                vetor[j + 1] = vetor[j]; // copia o valor para a direita da posição atual (j)
                j--;
            }
            vetor[j + 1] = atual;
        }
    }

     /*
        Algoritmo Selection Sort
    */
    public void selectionSort(int[] vetor) {
        int indiceMenor;
        countComparacoes = 0;

        for (int i = 0; i < vetor.length; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                countComparacoes++;
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            swapSelectionSort(vetor, indiceMenor, i);
        }
    }

    /*
        Swap Selection Sort para realizar as trocas.
    */
    private static void swapSelectionSort(int[] vetor, int indiceMenor, int i) {
        int aux = vetor[i];
        vetor[i] = vetor[indiceMenor];
        vetor[indiceMenor] = aux;
    }

    public void quickSort(int[] vetor, Tipo tipo) {
        if(tipo == Tipo.CRESCENTE)
            quickSortCrescente(vetor, 0, vetor.length-1);
        else
            quickSortDecrescente(vetor, 0, vetor.length-1);
    }

    /*
        Algoritmo Quick Sort Crescente.
    */
    private void quickSortCrescente(int[] vetor, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = vetor[ (esq + dir) / 2];

        while ( esq <= dir ) { // enquanto os indices não se cruzarem
            while (vetor[esq] < pivo) {
                esq++;
            }
            while (vetor[dir] > pivo) {
                dir--;
            }
            if( esq <= dir ) {
                swapQuickSort(vetor, esq, dir);
                esq++;
                dir--;
            }
        }
        if(dir - lo > 0) quickSortCrescente(vetor, lo, dir); // chamada recursiva do vetor à esquerda
        if(hi - esq > 0) quickSortCrescente(vetor, esq, hi); // chamada recursiva do vetor à direita
    }

    /*
        Algoritmo Quick Sort Decrescente.
    */
    private void quickSortDecrescente(int[] vetor, int lo, int hi) {
        int esq = lo;
        int dir = hi;

        int pivo = vetor[ (esq + dir) / 2];

        while ( esq <= dir ) { // enquanto os indices não se cruzarem
            while (vetor[esq] > pivo) {
                esq++;
            }
            while (vetor[dir] < pivo) {
                dir--;
            }
            if( esq <= dir ) {
                swapQuickSort(vetor, esq, dir);
                esq++;
                dir--;
            }
        }
        if(dir - lo > 0) quickSortDecrescente(vetor, lo, dir); // chamada recursiva do vetor à esquerda
        if(hi - esq > 0) quickSortDecrescente(vetor, esq, hi); // chamada recursiva do vetor à direita
    }

    /*
        Swap Quick Sort para realizar as trocas.
    */
    private static void swapQuickSort(int[] vetor, int indice1, int indice2) {
        int temp = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2] = temp;
    }
}
