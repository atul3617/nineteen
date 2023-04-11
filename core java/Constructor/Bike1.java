class Bike1
{
int cost;
String brand;
String colour;
Bike1(int cost,String brand,String colour)
{
this.cost=cost;
this.brand=brand;
this.colour=colour;
//return;
}
public static void main(String[]args)
{
Bike1 e1=new Bike1(213000,"royal","grey");
System.out.println(e1.cost);
System.out.println(e1.brand);
System.out.println(e1.colour);
}
}
