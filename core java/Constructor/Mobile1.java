class Mobile1
{
int mcost;
String mname;
String mcolour;
Mobile1(int mcost,String mname,String mcolour)
{
this.mcost=mcost;
this.mname=mname;
this.mcolour=mcolour;
//return;
}
public static void main(String[]args)
{
Mobile1 e1=new Mobile1(40000,"one plus","black");
System.out.println(e1.mcost);
System.out.println(e1.mname);
System.out.println(e1.mcolour);
}
}
