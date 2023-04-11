class Feb3
{
static void mult(int m,int n2)
{
for(int i=10;i>=n2;i--)
{
if (i%2==1)
	{
	System.out.println(i);
m=m*i;
	}
}
System.out.println(m);
}
public static void main(String[]args)
	{
mult(1,1);
}
}