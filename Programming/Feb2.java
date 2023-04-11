class Feb2
{
static void mult(int m,int n1,int n2)
{
	//int m=1;
for(int i=n1;i<=n2;i++)
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
mult(1,1,10);
}
}