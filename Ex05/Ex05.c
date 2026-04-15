#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define tamanho 20

int main() {
    
    int n = 0;
    int* pilha = (int*) malloc(sizeof(int) * tamanho);
    int* topo = pilha - 1; // pilha vazia
    int* fim = pilha + tamanho;

    scanf("%d", &n);
    char operacao[10];

    for (int i = 0; i < n; i++) {
        scanf("%s", operacao);

        if (strncmp("PUSH", operacao, 4) == 0) {
            int valor;
            scanf("%d", &valor);

            if (topo == fim - 1) {
                // pilha cheia 
                continue;
            }

            ++topo;
            *topo = valor;

            printf("PUSH: %d\n", valor);

        } else if (strncmp("POP", operacao, 3) == 0) {

            if (topo < pilha) {
                printf("ERRO: pilha vazia\n");
            } else {
                int valor = *topo;
                topo--;

                printf("POP: %d\n", valor);
            }

        } else if (strncmp("TOP", operacao, 3) == 0) {

            if (topo < pilha) {
                printf("ERRO: pilha vazia\n");
            } else {
                printf("TOP: %d\n", *topo);
            }
        }
    }

    int quantidade = topo - pilha + 1;
    if (topo < pilha) quantidade = 0;

    printf("TAMANHO: %d\n", quantidade);

    free(pilha);

    return 0;
}