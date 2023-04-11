class Feb1
{
static void mult(int n2)
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
System.out.println(m);
}
public static void main(String[]args)
	{
mult(10);
}
}