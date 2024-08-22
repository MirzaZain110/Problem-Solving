#include<stdio.h>
int main()
{

	int a,b,c,d,x1,x2,x3,x4;
	printf("Enter the 4 digit number :");
	scanf("%d",&a);
	x1=a/1000;
    b = a%1000;
	x2=b/100;
	c = b%100;
	x3=c/10;
	d = c%10;
	x4=d/1;
	printf("\nNumber is reverse %d%d%d%d",x4,x3,x2,x1);

}
