class Bike
{
int cost;
String brand;
String colour;
Bike(int a,String b,String c)
{
cost=a;
brand=b;
colour=c;
//return;
}
public static void main(String[]args)
{
Bike e1=new Bike(213000,"royal","grey");
System.out.println(e1.cost);
System.out.println(e1.brand);
System.out.println(e1.colour);
}
}
