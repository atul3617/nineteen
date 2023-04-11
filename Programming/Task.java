class Task
{
public static void main(String[]args)
{
String s="C1 O$D@EED OLC";
s=s.replaceAll(" ","");
String st=s.replaceAll("['$','@']","");
System.out.println(st);
String reverse="";
for(int i=0;i<=st.length()-1;i++)
	{
reverse=reverse+st.charAt(i);
}
if(st.equals(reverse))
	{
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}