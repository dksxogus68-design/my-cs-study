#include <stdio.h>

int main(void) {
    char str[101];
    int alpha[26];
    
    for(int i = 0; i < 26; i++) {
        alpha[i] = -1;
    }
    scanf("%s", str);
    
    for(int i = 0; str[i] != '\0'; i++) {
        if(alpha[str[i] - 'a'] == -1) {
            alpha[str[i] - 'a'] = i;
        }
    }
    for(int i = 0; i < 26; i++) {
        printf("%d ", alpha[i]);
    }
    return 0;
}