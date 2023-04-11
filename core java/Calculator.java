class Calculator
{
static int add(int a,int b)
	{  
	int r=(a+b);
	return r;
}
static int sub(int a,int b)
	{ 
 int r=(a-b);
 return r;
 }
static int mult(int a,int b)
	{
	int r=(a*b);
	return r;
}
static double div(int a,int b)
	{
	double r=(a/b);
    return r;
}
public static void main(String[]args)
{ int z=add(4,9);
  int x=sub(25,13);
  int w=mult(8,9);
  double y=div(98,12);

switch (3)
	{
case 1:
	System.out.println(z);
break;
case 2:
	System.out.println(x);
break;
case 3:
	System.out.println(w);
break;
case 4:
	System.out.println(y);
break;
default:System.out.println("invalid");
}
}
}