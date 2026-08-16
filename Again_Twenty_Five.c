#include <stdio.h>

int main() {
    unsigned long long n;
    scanf("%llu", &n);

    unsigned long long result = 1;
    unsigned long long base = 5;
    unsigned long long modulus = 100;

    while (n > 0) {
        if (n % 2 == 1)
            result = (result * base) % modulus;

        base = (base * base) % modulus;
        n /= 2;
    }

    printf("%02llu\n", result);

    return 0;
}
