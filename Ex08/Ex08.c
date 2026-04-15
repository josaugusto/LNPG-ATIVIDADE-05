#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int k;

    scanf("%d", &k);

    int* valores = (int*) malloc(sizeof(int) * k);
    
    for (int *p = valores; p < valores + k; p++) {
        scanf("%d", p);
    }

    float real;
    
    scanf("%f", &real);

    int soma = 0;

    for (int* p = valores; p < valores + k; p++) {
        soma += *p;
    }

    printf("SOMA_BRUTA: %d\n", soma);
    printf("SOMA_ESCALADA: %.2f\n", soma * real);

    int xor_check = 0;

    for (int* p = valores; p < valores + k; p++) {
        xor_check ^= *p;
    }

    printf("XOR_CHECK: %d\n", xor_check);
    int media = soma / k;
    printf("MEDIA_INT: %d\n", media);

    int qtd_acima_media = 0;

    int primeiro = 1;
    printf("ACIMA_MEDIA: ");

    for (int* p = valores; p < valores + k; p++) {
        if (*p > media) {
            if (!primeiro) {
                printf(" ");
            }
            printf("%d", *p);
            primeiro = 0;
            qtd_acima_media++;
        }
    }

    if (qtd_acima_media == 0) {
        printf("NENHUM");
    }

    printf("\n");

    if (xor_check == 0) {
        printf("STATUS: OK\n");
    } else {
        printf("STATUS: ERRO %d\n", xor_check);
    }

    free(valores);

    return 0;
}