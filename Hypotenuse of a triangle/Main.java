#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float hp,adj,opp;
  scanf("%f%f",&adj,&opp);
  hp=sqrt((adj*adj)+(opp*opp));
  printf("%0.2f",hp);
  return 0;
}