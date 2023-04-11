class Laptop1
{
int cost;
String lname;
String brand;
Laptop1(int cost,String lname,String brand)
{
this.cost=cost;
this.lname=lname;
this.brand=brand;
//return;
}
public static void main(String[]args)
{
Laptop1 e1=new Laptop1(45000,"vivobook","asus");
System.out.println(e1.cost);
System.out.println(e1.lname);
System.out.println(e1.brand);
}
}
