class School1
{
int strength;
String sname;
String grade;
School1(int strength,String sname,String grade)
{
this.strength=strength;
this.sname=sname;
this.grade=grade;
//return;
}
public static void main(String[]args)
{
School1 e1=new School1(4500,"shcs","first");
System.out.println(e1.strength);
System.out.println(e1.sname);
System.out.println(e1.grade);
}
}
