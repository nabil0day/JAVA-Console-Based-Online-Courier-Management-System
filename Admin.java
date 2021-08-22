public class Admin extends Id {

	public Admin()
	{
		super();
	}
	public Admin(String name, String address, String mobile, int age, String mail, String password)
	{
		super(name, address, mobile, age, mail, password);
	}

	
	public void showHerosBoard(Hero[] heros)
	{
		for (Hero hero : heros)
		{
			if (hero != null)
				hero.showInfo();
		}
	}

	public void showInfo()
	{
		
		System.out.println("Admins info -");
		super.showInfo();
	}
}