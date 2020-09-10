#include<stdio.h>
#include<math.h>
int main(){
//cosC=(a2+b2-c2)/2ab
//cosB=(a2+c2-b2)/2ac
//cosA=(b2+c2-a2)/2bc
  float a,b,c,A,B,C,pi;
  pi=acos(-1);
  printf("Please enter the length of three side of triangle: ");
  scanf("%f %f %f",&a,&b,&c);
  A=acos((a*a+b*b-c*c)/(2*a*b))*180/pi;
  printf("%.2f",A);
  return 0;
}
