class S12
{
static int mu(int m,int n1,int n2)
{
for(int i=n1;i<=n2;i++)
{
m=m*i;
}
return m;
}
public static void main(String[]args)
	{
System.out.println(mu(1,1,5));
}
}