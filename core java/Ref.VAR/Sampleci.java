class Sampleci
{
 double cir(int r)
{
final double a=3.142;
//int r=10;
double result=a*r*r;
    return result;
}
public static void main(String[]args)
	{
Sampleci s1=new Sampleci();
      double x=s1.cir(7);
System.out.println(x);
}
}