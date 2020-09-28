//Printing the sum of 1x2x3x4x----x(n-1)xn
#include<stdio.h>
int main(){
  int i,n,sum=1,fact=1;
  printf("Please enter the value of n: ");
  scanf("%d",&n);
  //for(i=1;i<=n;i++){
    //sum*=i;
  //}
  //printf("The sum of the series is %d",sum);
  for(i=1;i<=n;i++){
    fact=fact*i;
  }
  printf("The value of n factorial is %d",fact);
  return 0;
}
