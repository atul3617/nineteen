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
class Single
{
public static void main(String[] args)
	{
	demo d1=new demo();
     d1.displ();
System.out.println(d1.x);
	}
}