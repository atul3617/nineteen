class Sampletra
{
 double tra(int a,int b,int h)
{
//int a=3;
//int b=1;
//int h=5;
double result=a+b*h/2;
//int result=(tri/2);
return result;
}
public static void main(String[]args)
	{
Sampletra s1=new Sampletra();
	double x=s1.tra(4,7,9);
System.out.println(x);
}
}