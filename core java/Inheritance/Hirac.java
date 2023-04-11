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
class test extends sample
{
	void access()
	{
	System.out.println("hello");
	}
}
class Hirac
{
public static void main(String[] args)
	{
	test t1=new test();
     t1.access();
System.out.println(t1.x);
     demo d1=new demo();
	 d1.displ();
System.out.println(d1.x);
	}
}