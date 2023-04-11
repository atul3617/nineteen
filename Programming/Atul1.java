class Atul1
{
static void odd(int m)
{
int s=0;
//int m=1;
int i=1;
//int c=0;
while(i<=10)
{
if(i%2==1)
{
System.out.println(i);
s=s+i;
m=m*i;
i++;
}
//c++;
}
System.out.println(s);
System.out.println(m);
//System.out.println(c);
}
/*static void even(int m)
{
int s=0;
//int m=1;
int i=1;
//int c=0;
while(i<=10)
{
if(i%2==0)
{
System.out.println(i);
s=s+i;
m=m*i;
i++;
}
//c++;
}
System.out.println(s);
System.out.println(m);
//System.out.println(c);
}*/
public static void main(String[]args)
{
odd(1);
//even(1);
}
}