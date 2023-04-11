class Home
{
int cost;
String name;
String colour;
Home(int a,String b,String c)
{
cost=a;
name=b;
colour=c;
//return;
}
public static void main(String[]args)
{
Home e1=new Home(4500000,"paradise","white");
System.out.println(e1.cost);
System.out.println(e1.name);
System.out.println(e1.colour);
}
}
