#include<stdio.h>

void main() 
{

   int rad,area,circumference;
   printf("enter radius of the circle");
   scanf("%d",&rad);
   area=3.14*rad*rad;
   circumference=2*3.14*rad;
   printf("area=%d",area);
   printf("circumference=%d",circumference);
}
