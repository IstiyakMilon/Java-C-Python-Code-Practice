#include<stdio.h>
#include<math.h>

int main(){
float Ax,Ay,Bx,By,Cx,Cy, area;
printf("Please enter the co-ordinate of the triangle ");
scanf("%f%f%f%f%f%f",&Ax,&Ay,&Bx,&By,&Cx,&Cy);
area=abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
printf("The area of the triangle is %f",area);
return 0;
}
