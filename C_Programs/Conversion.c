#include<stdio.h>
int main()
{
	int m,cm,ft,inch,km;
	printf("Enter the distance in km");
	scanf("%d",&km);
	m=1000*km;
	cm=1000*m;
	inch=cm/2.54;
	ft=inch*12;
	printf("distance in meter=%d",m);
	printf("distance in centimeter=%d",cm);
	printf("distance in inch=%d",inch);
	printf("distance in feet=%d",ft);
	
	
}
