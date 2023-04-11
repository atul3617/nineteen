class Feb6
{
static int mult(int m,int n2)
{
for(int i=10;i>=n2;i--)
{
if (i%2==1)
	{
	System.out.println(i);
m=m*i;
	}
}
return m;
}
public static void main(String[]args)
	{
System.out.println(mult(1,1));
}
}