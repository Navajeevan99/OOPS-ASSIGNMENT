#include<iostream>
using namespace std;
int swap(int x, int y)
{
	int t=x;
	x=y;
	y=t;
	cout<<"\nThe value of x and y in swap function : "<<x<<" "<<y;
}
int main()
{
	int a,b;
	cout<<"Enter the two values : ";
	cin>>a>>b;
	cout<<"The value of a and b before calling swap function : "<<a<<" "<<b;
	swap(a,b);
	cout<<"\nThe value of a and b after calling swap function : "<<a<<" "<<b;
	
}
