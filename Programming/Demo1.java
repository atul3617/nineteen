class Sample
{
static int vowel(String str)
{
int c=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println(ch);
c++;
}
}
return c;
}
}
class Demo1
{
public static void main(String[]args)
{
System.out.println(Sample.vowel("ATUL"));
}
}