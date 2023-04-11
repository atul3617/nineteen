class Laptop
{
int cost;
String lname;
String brand;
Laptop(int a,String b,String c)
{
cost=a;
lname=b;
brand=c;
//return;
}
public static void main(String[]args)
{
Laptop e1=new Laptop(45000,"vivobook","asus");
System.out.println(e1.cost);
System.out.println(e1.lname);
System.out.println(e1.brand);
}
}
