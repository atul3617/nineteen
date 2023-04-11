class Car1
{
int cost;
String cname;
String ctype;
Car1(int cost,String cname,String ctype)
{
this.cost=cost;
this.cname=cname;
this.ctype=ctype;
//return;
}
public static void main(String[]args)
{
Car1 e1=new Car1(2000000,"Audi","petrol");
System.out.println(e1.cost);
System.out.println(e1.cname);
System.out.println(e1.ctype);
}
}
