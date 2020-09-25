#include<stdio.h>
#include<math.h>

int main(){
  int num1, num2, largest;
  printf("Please enter the three number: ");
  scanf("%d%d",&num1,&num2);
  largest = num1;
  if(largest<num2){
    largest=num2;
    printf("%d is the largest number",largest);
  }
  else if(largest>num2){
    printf("%d is the largest", largest);
  }
  else
    printf("Both number is equal");
  return 0;
}
