class Tv
{
int cost;
String brand;
String type;
Tv(int a,String b,String c)
{
cost=a;
brand=b;
type=c;
//return;
}
public static void main(String[]args)
{
Tv e1=new Tv(45000,"sony","qled");
System.out.println(e1.cost);
System.out.println(e1.brand);
System.out.println(e1.type);
}
}
