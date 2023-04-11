class Calci
{
static void add(int a,int b)
{
int r=(a+b);
System.out.println(r);
}
static void sub(int a,int b)
{
int r=(a-b);
System.out.println(r);
}
static void mult(int a,int b)
{
int r=(a*b);
System.out.println(r);
}
static void div(int a,int b)
{
double r=(a/b);
System.out.println(r);
}
public static void main(String[]args)
{
switch(6)
{
case 1:add(7,9);
break;
case 2:sub(6,3);
break;
case 3:mult(5,9);
break;
case 4:div(98,13);
break;
default:System.out.println("invalid can't execute");
}
}
}