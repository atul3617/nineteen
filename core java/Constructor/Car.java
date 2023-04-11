class Car
{
int cost;
String cname;
String ctype;
Car(int a,String b,String c)
{
cost=a;
cname=b;
ctype=c;
//return;
}
public static void main(String[]args)
{
Car e1=new Car(2000000,"Audi","petrol");
System.out.println(e1.cost);
System.out.println(e1.cname);
System.out.println(e1.ctype);
}
}
