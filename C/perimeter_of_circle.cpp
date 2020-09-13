#include<stdio.h>
#include<math.h>
int main(){
float pi, radius, perimeter;
pi=acos(-1);
printf("Please enter the radius of the circle:");
scanf("%f",&radius);
// perimeter=2*pi*radius
perimeter=2*pi*radius;
printf("The perimeter of the circle is %f",perimeter);
return 0;
}
