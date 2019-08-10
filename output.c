#include <stdio.h>
int main () {
int x = 0;
x = 1;
printf("O programa le numeros do teclado ate que um numero negativo seja digitado");
while (x>0) {
scanf("%d", &x);
}
printf("O numero digitado foi menor que 0.");
return 0;
}
