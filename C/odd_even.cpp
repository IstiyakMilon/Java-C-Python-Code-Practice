
#include<stdio.h>
#include<math.h>

int main(){
int number;
printf("Please enter the number ");
scanf("%d",&number);
if(number%2==0){
    printf("%d is Even number",number);
}
else {
    printf("%d is odd number", number);
}
return 0;
}
