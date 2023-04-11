class Feb8
{
static int mult(int n2)
{
	int m=1;
for(int i=1;i<=n2;i++)
{
if (i%2==0)
{
System.out.println(i);
m=m*i;
}
}
return m;
}
public static void main(String[]args)
	{
System.out.println(mult(10));
}
}