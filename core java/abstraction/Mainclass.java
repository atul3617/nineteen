interface shoppingmall{
	void shoping();

}
class clothes implements shoppingmall{
	public void shoping()
	{
	System.out.println("cloth shopping ");
	}
}
class food implements shoppingmall{
	public void shoping()
	{
		System.out.println(" eat food ");
	}
}
class movie implements shoppingmall{
	public void shoping()
	{
		System.out.println(" watch movie ");
	}
}
class customer{
	void purchase(shoppingmall s1)
	{
		s1.shoping();
	}
}
class Mainclass {

	public static void main(String[] args)
	{
		clothes c1=new clothes();
		food f1=new food();
		movie m1=new movie();
		customer a1=new customer();
		a1.purchase(c1);
		a1.purchase(f1);
	    a1.purchase(m1);
	}
}