#include<stdio.h>
#include<conio.h>

int main()
{
	int num[10];
	int cnt,nts;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nEnter any number : ");
		scanf("%d",&num[cnt]);
	}
	printf("\nEnter number to search : ");
	scanf("%d",&nts);
	for(cnt=0;cnt<10;cnt++)
	{
		if(num[cnt]==nts)
		{
			printf("\nNumber %d is at position : %d",nts,cnt);
			break;
		}
		if(cnt==9)
		{
		printf("\nNumber is not in the array");
		}
	}
	
	return 0;
}
