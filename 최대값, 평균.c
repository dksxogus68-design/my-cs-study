#include<stdio.h>

int main(void) {
    int n = 5;
    int scores[5];
    
    for(int i = 0; i < 5; i++) {
        scanf("%d", &scores[i]);
    }
    int max = scores[0];
    for(int i = 0; i < n; i++) {
        if(scores[i] > max) {
            max = scores[i];
        }
    }
    
    int sum = 0;
    for(int i = 0; i < 5; i++){
        sum += scores[i];
    }
    printf("%.2f %d\n", (double)sum / 5, max);
    return 0;
}