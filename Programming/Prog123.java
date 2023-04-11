class Prog123
{
static void cha(String str)
{
int c=0;
String reverse="";
for(int i=str.length()-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
c++;
}
System.out.println(c);
}
public static void main(String[]args)
{
cha("Atul");
}
}