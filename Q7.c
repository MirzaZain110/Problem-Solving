#include<stdio.h>
int main()
{
	int month,week,day,days;
	printf("Enter the number of days :");
	scanf("%d",&days);
	month = days/30;
	week = (days%30)/7;
	day = (days%30)%7;
	printf("The months : %d",month);
    printf("\nThe week : %d",week);	
	printf("\nThe day : %d",day);
}
