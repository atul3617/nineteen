class Progam
{ 
static String prg(String str)
{
String reverse="";
String as="java class";
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
if(str.equals(reverse))
{
System.out.println("string is pallendrome");
}
else
{
System.out.println("string is not pallendrome");
}
return as;
}
}
class Prog1
{
public static void main(String[]args)
{
String x=Progam.prg("ATUL");
System.out.println(x);
}
}