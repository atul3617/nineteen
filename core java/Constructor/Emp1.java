class Emp1
{
int eid;
String ename;
double sal;
Emp1(int eid,String ename,double sal)
{
this.eid=eid;
this.ename=ename;
this.sal=sal;
//return;
}
public static void main(String[]args)
{
Emp1 e1=new Emp1(1,"atul",48000.00);
System.out.println(e1.eid);
System.out.println(e1.ename);
System.out.println(e1.sal);
Emp1 e2=new Emp1(2,"rahul",68000.00);
System.out.println(e2.eid);
System.out.println(e2.ename);
System.out.println(e2.sal);
Emp1 e3=new Emp1(3,"neeloy",78000.00);
System.out.println(e3.eid);
System.out.println(e3.ename);
System.out.println(e3.sal);
}
}
