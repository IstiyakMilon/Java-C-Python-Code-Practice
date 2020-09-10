#include<stdio.h>
#include<math.h>
int main(){
//cosC=(a2+b2-c2)/2ab Angle C
//cosB=(a2+c2-b2)/2ac Angle B
//cosA=(b2+c2-a2)/2bc Angle A
  float a,b,c,A,B,C,pi;
  pi=acos(-1); // Calculating value of pi
  printf("Please enter the length of three side of triangle: ");
  scanf("%f %f %f",&a,&b,&c); // Taking length of each side of the triangle
  C=acos((a*a+b*b-c*c)/(2*a*b))*180/pi;
  B=acos((a*a+c*c-b*b)/(2*a*c))*180/pi;
  A=acos((c*c+b*b-a*a)/(2*b*c))*180/pi;
  printf("Angle A=%.2f Angle B=%.2f Angle C=%.2f",A, B, C);
  return 0;
}
