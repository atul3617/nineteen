class Ramu
{
double circ(int r)
{
final double pi=3.142;
double res=pi*r*r;
return res;
}
public static void main(String[]args)
{
Ramu r1=new Ramu();
System.out.println(r1.circ(8));
System.out.println(r1.circ(10));
}
}