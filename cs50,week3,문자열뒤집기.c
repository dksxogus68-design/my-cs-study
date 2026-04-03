#include<stdio.h>
#include<string.h>

int main(void) {
    char str[100]; 
    scanf("%s", str); //문자열 입력받기
    
    int length = strlen(str); //문자열의 길이
    
    //문자열 뒤집기 -> 5개이면 2번 뒤집는다. 즉 문자열 길이/2 번 뒤집음.
    for(int i = 0; i < length / 2; i++) {
        char temp = str[i];  
        str[i] = str[length -1 -i];//스왑을 통해 맨처음과 맨뒤를 바꾸고 점점 안에 하나씩 바꿈
        str[length -1 -i] = temp;
    }
    printf("%s", str);//바뀐 문자열을 출력
    return 0;
}