#include<iostream>
using namespace std;
class add
{
	int a,b,c;
	public:
		void getdata()
		{
			cout<<"Enter the two values : ";
			cin>>a>>b;
			calc();
			display();
		}
		 void calc();
		 void display();
};
void add :: calc()
{
	c=a+b;

}
void add :: display()
{
	cout<<"The addition of two numbers : "<<c;
}
int main()
{
	add s;
	s.getdata();
}
