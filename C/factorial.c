#include <stdio.h>

int main() {
    int n, i;
    long long factorial = 1;

    // Input
    printf("Enter an integer: ");
    if (scanf("%d", &n) != 1 || n < 0) {
        printf("Invalid input. Please enter a non-negative integer.\n");
        return 1; // Exit with an error code
    }

    // Calculate factorial
    for (i = 1; i <= n; ++i) {
        factorial *= i;
    }

    // Output the result
    printf("Factorial of %d = %lld\n", n, factorial);

    return 0;
}
