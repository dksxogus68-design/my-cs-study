#include <stdio.h>

int main(void) {
    int n;
    scanf("%d", &n); //정수 n개
    
    int arr[n];//n개의 정수 입력받기
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for(int i = 0; i < n-1; i++) {
        for(int j = 0; j < n-1-i; j++){
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; //버블정렬을 통한 arr[n]을 정렬
            }
        }
    }
    //이제 arr[n]을 정렬했으니까 찾는 알고리즘 작성하기
    int m;  //정수 m개
    scanf("%d", &m);
    
    int target;//m개의 정수를 입력받기
    for(int k = 0; k < m; k++) {
        scanf("%d", &target);
    
    int left = 0; //배열의 왼쪽 끝
    int right = n-1;//배열의 오른쪽 끝
    int found = 0; //못찾으면 0
    
    while(left<=right) {
        int mid = (left+right)/2; //가운데는 끝과 끝의 반
        if(arr[mid] == target) {
            found = 1;  //찾으면 바로 while루프 스탑
            break;
        }
        else if(arr[mid] < target) {
            left = mid+1; //가운데가 목표보다 작으면 맨 왼쪽을 가운데보다 1크게
        }
        else {
            right = mid-1;//가운데가 목표보다 크면 맨 오른쪽을 가운데보다 1작게
        }
     }
     printf("%d", found);
   }
   return 0;   
}