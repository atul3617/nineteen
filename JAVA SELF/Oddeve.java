class Oddeve
{
static void pra(int a,int b)
{
for(int i=a;i<=b;i++)
{
if(i%2==1)
{
System.out.println("the odd number are"+i);
}
else
{
System.out.println("the even number are"+i);
}
}
}
public static void main(String[]args)
{
int a=1;
int b=20;
pra(a,b);
}
}