#include<iostream>
using namespace std;
int &big(int &x, int &y)
{
	if (x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
}
int main()
{
	int a,b;
	cout<<"Enter the two values : ";
	cin>>a>>b;
	big(a,b)=1;
	if (a==1)
	{
		cout<<"a is bigger than b";
	}
	else
	{
		cout<<"b is bigger than a";
	}

	
}
