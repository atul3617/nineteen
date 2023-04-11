class Sample
{
 double cir(int r)
{
final double a=3.142;
double result=a*r*r;
return result;
}
}
class Sa3
{
	public static void main(String[]args)
	{
Sample s1=new Sample();
      double x=s1.cir(7);
System.out.println(x);
}
}