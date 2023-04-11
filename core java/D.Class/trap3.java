class Sam
{
static double trap()
{
	int a=6;
	int b=9;
	int h=4; 
double res=((a+b*h)/2);
//System.out.println(res);
return res;
}
}
class trap3
{
public static void main(String[]args)
{
double z=Sam.trap();
System.out.println(z);
}
}