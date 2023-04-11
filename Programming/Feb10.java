class Feb10
{
static int count(int c,int n2)
{
for(int i=10;i>=n2;i--)
{
if (i%2==1)
	{
	System.out.println(i);
c++;
	}
}
return c;
}
public static void main(String[]args)
	{
System.out.println(count(0,1));
}
}