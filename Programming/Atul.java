class Atul
{
static int odd(int n2)
{
int s=0;
int m=1;
int i=1;
int c=0;
while(i<=n2)
{
if(i%2==1)
{
System.out.println(i);
s=s+i;
m=m*i;
i++;
c++;
}
}
System.out.println(s);
System.out.println(m);
return c;
}
static int even(int n2)
{
int s=0;
int m=1;
int i=1;
int c=0;
while(i<=n2)
{
if(i%2==0)
{
System.out.println(i);
s=s+i;
m=m*i;
i++;
c++;
}
}
System.out.println(s);
System.out.println(m);
return c;
}
public static void main(String[]args)
{
System.out.println(odd(10));
System.out.println(even(10));
}
}