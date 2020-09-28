#include<stdio.h>
int main(){
  int a,b,c, largest;
  printf("Enter the numbers: ");
  scanf("%d %d %d",&a, &b, &c);
  if(a>b && a>c){
    printf("%d is the largest number of the three",a);
  } else if(b>a && b>c){
    printf("%d is the largest number of the three",b);
  } else {
    printf("%d is the largest number of the three",c);
  }
 return 0;
}
