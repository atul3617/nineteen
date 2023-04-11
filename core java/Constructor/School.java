class School
{
int strength;
String sname;
String grade;
School(int a,String b,String c)
{
strength=a;
sname=b;
grade=c;
//return;
}
public static void main(String[]args)
{
School e1=new School(4500,"shcs","first");
System.out.println(e1.strength);
System.out.println(e1.sname);
System.out.println(e1.grade);
}
}
