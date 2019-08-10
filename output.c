#include <stdio.h>
int main () {
int x01 = 0;
int x02 = 0;
int a = 0;
int b = 0;
int c = 0;
int d = 0;
double f1 = 0;
double f2 = 0;
scanf("%d", &x01);
scanf("%d", &x02);
scanf("%d", &a);
scanf("%lf", &f1);
printf("%d", b);
printf("%lf", f1);
printf("1234");
f2 = c;
f1 = 2.5+(3.0/1.5)*f2;
d = -1;
b = a+c*c;
if (a==2) {
printf("a eh igual a 2");
}
else {
c = 1;
printf("a diferente de 2");
}
while (a>b) {
a = a+1;
}
do {
scanf("%lf", &f1);
} while (f1>0.02);
return 0;
}
