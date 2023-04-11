class Samplerec
{
 int rec(int w,int h)
{
//int w=10;
//int h=10;
int result=w*h;
//int result=(tri/2);

return result;
}
public static void main(String[]args)
	{
Samplerec s1=new Samplerec();
	int x=s1.rec(4,8);
System.out.println(x);
}

}