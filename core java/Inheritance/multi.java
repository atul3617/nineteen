class sample
{
	int x=20;
}
class demo extends sample
{
	void displ()
	{
	System.out.println("heee");
	}
}
class test extends demo
{
	void access()
	{
	System.out.println("hello");
	}
}
class multi
{
public static void main(String[] args)
	{
	test t1=new test();
     t1.access();
System.out.println(t1.x);
     t1.displ();
	}
}