class Emp
{
int eid;
String ename;
double sal;
Emp(int a,String b,double c)
{
eid=a;
ename=b;
sal=c;
//return;
}
public static void main(String[]args)
{
Emp e1=new Emp(1,"atul",48000.00);
System.out.println(e1.eid);
System.out.println(e1.ename);
System.out.println(e1.sal);
Emp e2=new Emp(2,"rahul",68000.00);
System.out.println(e2.eid);
System.out.println(e2.ename);
System.out.println(e2.sal);
Emp e3=new Emp(3,"neeloy",78000.00);
System.out.println(e3.eid);
System.out.println(e3.ename);
System.out.println(e3.sal);
}
}
