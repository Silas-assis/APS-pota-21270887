public class App {
    public static void main(String[] args) throws Exception {
        
        Ordena ordena = new Ordena();

        int [] vetorTeste = new int [100];
        int [] vetorTamanho5 = new int [5];

        for (int i = 0; i < vetorTeste.length; i++) {
            vetorTeste[i] = (int) (Math.random() * vetorTeste.length);
        }

        for (int i = 0; i < vetorTeste.length; i++) {
            System.out.print(vetorTeste[i] + " ");
        }

        System.out.println("");

        //ordena.bubbleSort(vetorTeste);
        //ordena.insertionSort(vetorTeste);
        //ordena.selectionSort(vetorTeste);
        //ordena.quickSort(vetorTeste, Ordena.Tipo.CRESCENTE);
        ordena.quickSort(vetorTeste, Ordena.Tipo.DECRESCENTE);


        for (int i = 0; i < vetorTeste.length; i++) {
            System.out.print(vetorTeste[i] + " ");
        }
    }
}
