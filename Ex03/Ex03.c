#include <stdio.h>
#include <stdlib.h>

int main(void) {

    int id_sensor = 0;

    struct Sensor{
        int id_sensor;
        float temperatura;
        char status;
    };

    struct Sensor s1;
    struct Sensor* ptr_sensor = &s1;

    scanf("%d", &ptr_sensor->id_sensor);
    scanf("%f", &ptr_sensor->temperatura);
    scanf(" %c", &ptr_sensor->status);

    printf("%d\n", ptr_sensor->id_sensor);
    printf("%.2f\n", ptr_sensor->temperatura);
    printf("%c\n", ptr_sensor->status);

    if (ptr_sensor->temperatura > 50.0 && ptr_sensor->status == 'A') {
        printf("SIM\n");
    } else {
        printf("NAO\n");
    }

    ptr_sensor->id_sensor *= 2;
    ptr_sensor->id_sensor += (int) ptr_sensor->temperatura;

    printf("COMPOSTO: %d", ptr_sensor->id_sensor);

    return 0;
}