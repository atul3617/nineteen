class Course
{
int cost;
String cname;
String uname;
Course(int a,String b,String c)
{
cost=a;
cname=b;
uname=c;
//return;
}
public static void main(String[]args)
{
Course e1=new Course(44000,"java","jspider");
System.out.println(e1.cost);
System.out.println(e1.cname);
System.out.println(e1.uname);
}
}
