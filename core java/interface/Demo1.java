interface Sample
{
void test();
}
interface atul extends Sample
{
void disp();

}
class Demo1 implements atul
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