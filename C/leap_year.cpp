#include<stdio.h>
#include<math.h>

int main(){
int year;
printf("Please enter the year ");
scanf("%d",&year);
if(year%400==0 || (year%100!=0 && year%4==0)){
    printf("%d is leap year", year);
}
else {
    printf("%d is not leap year", year);
}
return 0;
}
