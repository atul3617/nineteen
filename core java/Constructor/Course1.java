class Course1
{
int cost;
String cname;
String uname;
Course1(int cost,String cname,String uname)
{
this.cost=cost;
this.cname=cname;
this.uname=uname;
//return;
}
public static void main(String[]args)
{
Course1 e1=new Course1(44000,"java","jspider");
System.out.println(e1.cost);
System.out.println(e1.cname);
System.out.println(e1.uname);
}
}
