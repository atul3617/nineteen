class Cloth
{
int cost;
String size;
String colour;
Cloth(int a,String b,String c)
{
cost=a;
size=b;
colour=c;
//return;
}
public static void main(String[]args)
{
Cloth e1=new Cloth(80000,"xl","black");
System.out.println(e1.cost);
System.out.println(e1.size);
System.out.println(e1.colour);
}
}
