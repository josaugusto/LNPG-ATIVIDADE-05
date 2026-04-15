#include <stdio.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);

    static int global;
    int local;

    int *ptr_global = &global;
    int *ptr_local = NULL;

    char comando[50];
    int valor;

    for (int i = 0; i < n; i++) {
        scanf("%s", comando);

        if (strcmp(comando, "SET_GLOBAL") == 0) {
            scanf("%d", &valor);
            global = valor;
        }
        else if (strcmp(comando, "SET_LOCAL") == 0) {
            scanf("%d", &valor);
            local = valor;
            ptr_local = &local;
        }
        else if (strcmp(comando, "READ_GLOBAL") == 0) {
            printf("GLOBAL: %d\n", *ptr_global);
        }
        else if (strcmp(comando, "READ_LOCAL") == 0) {
            if (ptr_local != NULL) {
                printf("LOCAL: %d\n", *ptr_local);
            } else {
                printf("LOCAL: %d\n", *ptr_global);
            }
        }
        else if (strcmp(comando, "RESET_LOCAL") == 0) {
            ptr_local = NULL;
        }
    }

    // saída final
    if (ptr_local != NULL) {
        printf("HISTORICO: G=%d L=%d\n", *ptr_global, *ptr_local);
    } else {
        printf("HISTORICO: G=%d L=NENHUM\n", *ptr_global);
    }

    return 0;
}
