class Pro
{
static String cha(String str)
{
int c=0;
String reverse="";
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
c++;
}
System.out.println(c);
if (str.equals(reverse))
{
	System.out.println("str is pd");
}
else
	{
	System.out.println("str is not pd");
	}
return reverse;
}
}
class Demo
{
public static void main(String[]args)
{
System.out.println(Pro.cha("Atul"));
}
}