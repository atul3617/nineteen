class Samplee
{
	double elli(int a,int b)
{
final double pie=3.142;

double result=pie*a*b;
//int result=(tri/2);
return result;
}
}
class Sam3
{
public static void main(String[]args)
	{
Samplee s1=new Samplee();
	double x=s1.elli(6,8);
System.out.println(x);
}
}