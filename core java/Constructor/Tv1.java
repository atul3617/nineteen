class Tv1
{
int cost;
String brand;
String type;
Tv1(int cost,String brand,String type)
{
this.cost=cost;
this.brand=brand;
this.type=type;
//return;
}
public static void main(String[]args)
{
Tv1 e1=new Tv1(45000,"sony","qled");
System.out.println(e1.cost);
System.out.println(e1.brand);
System.out.println(e1.type);
}
}
