#include<stdio.h>
#include<math.h>

int main(){
float x1,y1,x2,y2,dx,dy;
float distance;
printf("Please enter two points:");
scanf("%f %f %f %f",&x1,&y1,&x2,&y2);//3 6 0 0
dx=x2-x1;
dy=y2-y1;
distance=sqrt((dx*dx)+(dy*dy));
printf("The distance of the two point is %f",distance);
return 0;
}
