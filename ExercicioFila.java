package fila_e_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();
        int codigo;

        do {
            System.out.println("1- Adicionar cliente na fila\n2- Listar todos os clientes\n3- Retirar cliente da fila\n0- Sair\nEntre com a opção desejada:");
            codigo = leia.nextInt();
            leia.nextLine();

            switch (codigo) {
                case 1:
                    System.out.println("Digite o nome: ");
                    fila.offer(leia.nextLine());
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!\n");
                    } else {
                        System.out.println("\nLista de Clientes na Fila: " + fila + "\n");
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        fila.remove();
                        System.out.println("\nFila: " + fila + "\n");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma finalizado.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
                    break;

            }
        } while (codigo != 0);
    }
}


