class Calculato
{
static void add(int a,int b)
	{  
	int r=(a+b);
	System.out.println(r);
	//return r;
}
static void sub(int a,int b)
	{ 
 int r=(a-b);
 System.out.println(r);
 //return r;
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
{ 

switch (4)
	{
case 1:
	add(4,9);
add(6,8);
break;
case 2:
	sub(25,13);
break;
case 3:
	System.out.println(mult(8,9));
break;
case 4:
	System.out.println(div(98,12));
break;
default:System.out.println("invalid");
}
}
}