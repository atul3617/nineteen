class Progam
{ 
static String prg(String str)
{
String reverse="";
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
return reverse;
}
}
class Prog
{
public static void main(String[]args)
{
String x=Progam.prg("ATUL");
System.out.println(x);
}
}