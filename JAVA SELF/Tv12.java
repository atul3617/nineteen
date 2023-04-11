class Tv12
{
int cost;
String brand;
String type;
Tv12(int cost,String brand,String type)
{
cost=cost;
brand=brand;
type=type;
//return;
}
public static void main(String[]args)
{
Tv12 e1=new Tv12(45000,"sony","qled");
System.out.println(e1.cost);
System.out.println(e1.brand);
System.out.println(e1.type);
}
}
