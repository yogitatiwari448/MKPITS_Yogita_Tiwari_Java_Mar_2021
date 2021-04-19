#include <stdio.h>

int main()
{
    int marks,eng, phy, chem; 
    int total;
	float percentage;

    printf("Enter marks of three subjects: \n");
    scanf("%d%d%d", &eng, &phy, &chem);

    total = eng + phy + chem;
    
    percentage = (total / 300.0) * 100;

    printf("Total marks = %d", total);
    printf("Percentage = %f", percentage);

    return 0;
}
