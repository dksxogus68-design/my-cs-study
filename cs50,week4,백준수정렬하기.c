#include<stdio.h>

int main(void) {
    int n;
    scanf("%d", &n); // 입력받을 정수의 개수
    
    int arr[n]; //배열선언 = 각각의 정수를 입력받기 위함
    
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]); // 각각의 정수를 입력받기
    }
    //양쪽 수를 비교하면 n-1번 비교해야 함
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-1-i; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j]; //j<n-1-i인 이유: i=0일때 가장 큰수는 맨 오른쪽에 정렬 n-1번
                                   // i=1 일 때 하나 더 오른쪽 정렬 n-2번 정렬
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i = 0; i < n; i++) {
        printf("%d\n", arr[i]);
    }
    return 0;
   
}