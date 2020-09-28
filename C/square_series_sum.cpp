//Sum of 1^2 + 2^2 + 3^2 ……. n^2
#include<stdio.h>
int main(){
  int i, n, sum=0;
  printf("Please enter the value of n: ");
  scanf("%d",&n);
  for(i=1;i<=n;i++){
    sum+=i*i;
  }
  printf("The sum of the series is %d",sum);
  return 0;
}
