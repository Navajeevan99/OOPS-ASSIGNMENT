#include<iostream>
using namespace std;
class A
{
public: 
    A(int val) {}
};

class B : public A
{
};

class C : public A
{
public:
    C(const string &val) {}
};

class D : public A
{
public:
    D(const string &val) {}
    using A::A;              // g++ error: A::A names constructor
};

int main()
{
    B b(10);                // Ok.   (A::A constructor is not overlapped)
    C c(10);                // error: no matching function to call to 'C::C(int)'
}
