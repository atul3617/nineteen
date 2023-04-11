class Samplet
{
 double tra(int a,int b,int h)
{
double result=a+b*h/2;
//int result=(tri/2);
return result;
}
}
class Tr3
{
public static void main(String[]args)
	{
Samplet s1=new Samplet();
	double x=s1.tra(4,6,8);
System.out.println(x);
}
}