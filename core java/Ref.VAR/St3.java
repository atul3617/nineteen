class Sampt
{
	double tra(int b,int h)
{
double tri=b*h/2;
//int result=(tri/2);
return tri;
}
}
class St3
{
public static void main(String[]args)
	{
Sampt s1=new Sampt();
	double x=s1.tra(10,6);
System.out.println(x);
}
}