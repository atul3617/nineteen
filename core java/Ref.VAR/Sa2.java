class Sample
{
 void cir(int r)
{
final double a=3.142;
double result=a*r*r;
System.out.println(result);
}
}
class Sa2
{
	public static void main(String[]args)
	{
Sample s1=new Sample();
      s1.cir(7);
}
}