#include<stdio.h>
int main()
{
	int length,breadth,height,volume;
	printf("Enter lenghth,breadth and height of rectangle");
	scanf("%d%d%d",&length,&breadth,&height);
	volume=length*breadth*height;
	printf("volume=%d",volume);
}
