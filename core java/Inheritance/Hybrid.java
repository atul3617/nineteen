class grandf
{
int x=10;
}
class father extends grandf
{
void property()
{
System.out.println("hard work");
}
}
class son extends father
{
void raja()
{
System.out.println("everthing is yours");
}
}
class uncle extends grandf
{
void property()
{
System.out.println("sharing");
}
}
class Hybrid
{
public static void main(String[]args)
{
son s1=new son();
s1.raja();
s1.property();
System.out.println(s1.x);
uncle u1=new uncle();
u1.property();
System.out.println(u1.x);
}
}