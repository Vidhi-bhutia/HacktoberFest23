#include <iostream>

// Function to calculate the factorial of a number
unsigned long long factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

int main() {
    int n;

    // Input
    std::cout << "Enter a non-negative integer: ";
    std::cin >> n;

    // Check for valid input
    if (n < 0) {
        std::cout << "Invalid input. Please enter a non-negative integer." << std::endl;
        return 1; // Exit with an error code
    }

    // Calculate factorial
    unsigned long long result = factorial(n);

    // Output
    std::cout << "Factorial of " << n << " = " << result << std::endl;

    return 0;
}
