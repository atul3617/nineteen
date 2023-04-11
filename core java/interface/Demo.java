interface Sample
{
void test();
void disp();
}
class Demo implements Sample
{
public void test()
{
System.out.println("heyy");
}
public void disp()
{
System.out.println("hello");
}
public static void main(String[] args)
{
Demo d1=new Demo();
d1.test();
d1.disp();
}
}