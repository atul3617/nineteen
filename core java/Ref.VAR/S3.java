class Sampler
{
 int rec(int w,int h)
{

int result=w*h;
//int result=(tri/2);
return result;
}
}
class S3
{
public static void main(String[]args)
	{
Sampler s1=new Sampler();
	int x=s1.rec(8,5);
System.out.println(x);
}

}