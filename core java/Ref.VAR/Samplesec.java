class Samplesec
{
 double sec(int r)
{
final double o=30.5;
//int r=10;
//int b=15;
double result=r*r*o/2;
//int result=(tri/2);
return result;
}
public static void main(String[]args)
	{
Samplesec s1=new Samplesec();
   double x =s1.sec(7);
System.out.println(x);

}
}