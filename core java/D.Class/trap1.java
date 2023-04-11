class Sam
{
static void trap(int a,int b,int h)
{ 
double res=((a+b*h)/2);
System.out.println(res);
}
}
class trap1
{
public static void main(String[]args)
{
Sam.trap(4,7,8);
}
}