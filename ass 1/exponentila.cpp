#include <iostream>
#include <iomanip>

int main() {
    float num1, num2;
    std::cout << "Enter two float values : ";
    std::cin >> num2 >> num1;

    float result = num2 / num1;

    std::cout << std::fixed << std::setprecision(5);
    std::cout << "Division result in fixed form = " << result << "\n";

    std::cout << std::scientific;
    std::cout << "Division result in scientific form = " << result << "\n";

    return 0;
}
