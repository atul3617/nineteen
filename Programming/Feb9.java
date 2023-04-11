class Feb9
{
static int count(int n2)
{
	int c=0;
for(int i=1;i<=n2;i++)
{
if (i%2==0)
{
System.out.println(i);
c++;
}
}
return c;
}
public static void main(String[]args)
	{
System.out.println(count(10));
}
}