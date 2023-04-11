class Samplet
{
 void tra(int a,int b,int h)
{
double result=a+b*h/2;
//int result=(tri/2);
System.out.println(result);
}
}
class Tr2
{
public static void main(String[]args)
	{
Samplet s1=new Samplet();
	s1.tra(4,6,8);
}
}