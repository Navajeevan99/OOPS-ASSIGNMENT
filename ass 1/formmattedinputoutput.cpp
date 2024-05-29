#include <iostream>
using namespace std;
int main() {
	cout.setf(ios::showpoint); // Set as showpoint
	cout.setf(ios::showpos); // Set as showpos
	cout.precision(3);
	cout.setf(ios::fixed,ios::floatfield); // Set as fixed and floatfield
	cout.setf(ios::internal,ios::adjustfield); // Set as internal and adjustfield
	cout.fill('*');
	cout.width(10);
	cout << 275.5 << "\n";
}
