class Mobile
{
int mcost;
String mname;
String mcolour;
Mobile(int a,String b,String c)
{
mcost=a;
mname=b;
mcolour=c;
//return;
}
public static void main(String[]args)
{
Mobile e1=new Mobile(40000,"one plus","black");
System.out.println(e1.mcost);
System.out.println(e1.mname);
System.out.println(e1.mcolour);
}
}
