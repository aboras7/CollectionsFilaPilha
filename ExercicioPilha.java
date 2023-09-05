package fila_e_pilha;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();
        int codigo;

        do {
            System.out.println("1- Adicionar livro na pilha\n2- Listar todos os livros na pilha\n3- Retirar um livro da pilha\n0- Sair\nEntre com a opção desejada:");
            codigo = leia.nextInt();
            leia.nextLine();

            switch (codigo) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    pilha.push(leia.nextLine());
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Fila está vazia!\n");
                    } else {
                        System.out.println("\nLista de livros na pilha: " + pilha + "\n");
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        pilha.pop();
                        System.out.println("\nPilha: " + pilha + "\n");
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