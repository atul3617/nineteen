class amazon{
	void order()
	{
		System.out.println("purchase");
	}
}
class grocery extends amazon{
	void order()
	{
	System.out.println("grocery ");
	}
}
class footware extends amazon{
	void order()
	{
		System.out.println("footware");
	}
}
class electronics extends amazon{
	void order()
	{
		System.out.println("electric ");
	}
}
class user{
	void buy(amazon a1)
	{
		a1.order();
	}
}
class Mainclass3 {

	public static void main(String[] args)
	{
		 electronics e1=new electronics();
		grocery g1=new grocery();
		footware f1=new footware();
		user u1=new user();
		u1.buy(e1);
		u1.buy(g1);
	    u1.buy(f1);
	}
}