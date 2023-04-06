#include <stdio.h>
int main() {
   int i, j, rows;
   printf("Enter the number of rows: ");
   scanf("%d", &rows);
   int a =1;
   for (i = 1; i <= rows; ++i) {
      for (j = 1; j <= a; ++j) {
         printf("* ");
      }
      printf("\n");
      a+=2;
   }
   return 0;
}