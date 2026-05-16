#include <stdio.h>
int main() {
    int n;
    scanf("%d",&n);
    int i,j,count;
    int a[70];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
    }for(j=0;i<n;j++){
        if(a[i]!=a[j]){
            count++;
            break;
        }
    }printf("the no of duplicate elements are in this array is %d",count);
    
    return 0;
}