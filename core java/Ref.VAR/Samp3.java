class Samplep
{
int para(int b,int h)
{
int result=b*h;
//int result=(tri/2);
return result;
}
}
class Samp3
{
public static void main(String[]args)
	{
Samplep s1=new Samplep();
	int x=s1.para(6,8);
System.out.println(x);
}
}