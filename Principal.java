import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Escolha um algoritmo de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            int escolha = scanner.nextInt();

            ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
            switch (escolha) {
                case 1:
                    contexto.setEstrategia(new OrdenacaoBubbleSort());
                    break;
                case 2:
                    contexto.setEstrategia(new OrdenacaoSelectionSort());
                    break;
                case 3:
                    contexto.setEstrategia(new OrdenacaoInsertionSort());
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    return;
            }

            System.out.println("Números antes da ordenação: " + numeros);
            contexto.executarOrdenacao(numeros);
            System.out.println("Números após a ordenação: " + numeros);
        } finally {
            scanner.close(); // Fechando o Scanner
        }
    }
}
