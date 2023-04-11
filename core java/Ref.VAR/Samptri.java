class Samptri
{
	double tra(int b)
{
//int b=10;
int h=10;
double tri=b*h/2;
//int result=(tri/2);
return tri;
}
public static void main(String[]args)
	{
Samptri s1=new Samptri();
	double x=s1.tra(8);
System.out.println(x);
}
}