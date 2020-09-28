//Printing the sum of series 1+2+3+-----+N
#include<stdio.h>
int main(){
  int i,n,sum=0;
  printf("Please enter the last number of the series:");
  scanf("%d",&n);
  //for(i=1;i<=n;i++){
   // sum=sum+i;
  //}
  sum=n*(n+1)/2;
  printf("The sum of the series is: %d",sum);
  return 0;
}
