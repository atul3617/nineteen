class Samples
{
 double sec(int r)
{
final double o=30.5;

//int b=15;
double result=r*r*o/2;
//int result=(tri/2);
return result;
}
}
class Sampl3
{
public static void main(String[]args)
	{
Samples s1=new Samples();
      double x=s1.sec(6);
System.out.println(x);
}
}