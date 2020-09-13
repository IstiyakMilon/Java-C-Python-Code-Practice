#include<stdio.h>
#include<math.h>

int main(){
float a,b,c,half_perimeter,area;
printf("Please enter length of the three sides:");
scanf("%f%f%f",&a,&b,&c);
half_perimeter=(a+b+c)/2;
area=sqrt(half_perimeter*(half_perimeter-a)*(half_perimeter-b)*(half_perimeter-c));
//printf("%f %f %f %f", a, b, c, half_perimeter);
printf("The area of triangle is %f",area);
return 0;
}
