C++ Hybrid Inheritance Block Diagram
 
C++ Hybrid Inheritance Syntax
class A
{
     .........
};
class B : public A
{
     ..........
} ;
class C
{
     ...........
};
 class D : public B, public C
{
     ...........
};
As shown in block diagram class B is derived 
from class A which is single inheritance and then 
Class D is inherited from B and class C which is
 multiple inheritance. So single inheritance and
  multiple inheritance jointly results in hybrid inheritance.
class A
{
 	public:
 	int x;
};
class B : public A
{
 	public:
 	B()      //constructor to initialize x in base class A
 	{
 	   x = 10;
 	}
};
class C
 {
 	public:
 	int y;
 	C()   //constructor to initialize y
 	{
 	    y = 4;
    }
};
class D : public B, public C   //D is derived from class B and class C
{
 	public:
 	void sum()
 	{
 	    cout << "Sum= " << x + y;
 	}
};

void main()
{
         D obj1;          //object of derived class D
 	obj1.sum();
 	getch();
}               	//end of program
Output
Sum= 14

