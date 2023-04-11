interface youtube{
	void watch();
}
class study implements youtube{
	public void watch()
	{
	System.out.println("education ");
	}
}
class movie implements youtube{
	public void watch()
	{
		System.out.println("hollywood");
	}
}
class standup implements youtube{
	public void watch()
	{
		System.out.println("desh ka yuva");
	}
}
class user{
	void access(youtube y1)
	{
		y1.watch();
	}
}
class Mainclass4 {

	public static void main(String[] args)
	{
		 study s1=new study();
		standup u1=new standup();
		movie m1=new movie();
		user a1=new user();
		a1.access(s1);
		a1.access(u1);
	    a1.access(m1);
	}
}