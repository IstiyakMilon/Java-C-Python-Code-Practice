#include<stdio.h>
#include<math.h>
int main(){
int number, nearest_num;
printf("Please enter the number ");
scanf("%d", &number);
nearest_num=sqrt(number)+1;
printf("The nearest number of the square root is %d",nearest_num);
return 0;
}
