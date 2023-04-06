#include <stdio.h>
void main()
{
    int x=3,y=4,a=6, z=7,result;
    result=(x>y)+ ++a||!z;
    printf("%d",result);
}