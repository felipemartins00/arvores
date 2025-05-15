package com.company;

public class Arvore {
    No raiz;

    void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }


    No inserirRec(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerdo = inserirRec(atual.esquerdo, valor);
        } else {
            atual.direito = inserirRec(atual.direito, valor);
        }

        return atual;
    }

    void emOrdem() {
        emOrdemRec(raiz);
        System.out.println();
    }

    void emOrdemRec(No no) {
        if (no != null) {
            emOrdemRec(no.esquerdo);
            System.out.print(no.valor + " ");
            emOrdemRec(no.direito);
        }
    }
}
