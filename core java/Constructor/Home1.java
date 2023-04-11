class Home1
{
int cost;
String name;
String colour;
Home1(int cost,String name,String colour)
{
this.cost=cost;
this.name=name;
this.colour=colour;
//return;
}
public static void main(String[]args)
{
Home1 e1=new Home1(4500000,"paradise","white");
System.out.println(e1.cost);
System.out.println(e1.name);
System.out.println(e1.colour);
}
}
