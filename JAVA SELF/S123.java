class S123
{
static int coun(int c,int n1,int n2)
{
for(int i=n1;i<=n2;i++)
{
c++;
}
return c;
}
public static void main(String[]args)
	{
System.out.println(coun(0,1,5));
}
}