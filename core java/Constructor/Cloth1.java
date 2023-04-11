class Cloth1
{
int cost;
String size;
String colour;
Cloth1(int cost,String size,String colour)
{
this.cost=cost;
this.size=size;
this.colour=colour;
//return;
}
public static void main(String[]args)
{
Cloth1 e1=new Cloth1(80000,"xl","black");
System.out.println(e1.cost);
System.out.println(e1.size);
System.out.println(e1.colour);
}
}
