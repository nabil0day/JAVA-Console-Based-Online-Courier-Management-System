import java.util.*;
public class IdsData {
	Id[] ids;
	Scanner input = new Scanner(System.in);
	Scanner input2 = new Scanner(System.in);
	public IdsData()
	{
		ids = new Id[20];
	}

	public void addId(Id id)
	{
		for (int i = 0; i < 10; i++)
		{
			if (ids[i] == null)
			{
				ids[i] = id;
				break;
			}
		}
	}

	public Hero createHero()
	{
		String name;
		String address;
		String mobile;
		int age;
		String mail;
		String password;
		System.out.print("Heros name - ");
		name = input.nextLine();
		System.out.print("Heros address - ");
		address = input.nextLine();
		System.out.print("Heros mobile - ");
		mobile = input.nextLine();
		System.out.print("Heros age - ");
		age = input2.nextInt();
		System.out.print("Heros mail - ");
		mail = input.nextLine();
		System.out.print("Heros password - ");
		password = input.nextLine();
		return (new Hero(name, address, mobile, age, mail, password));
	}

	public Admin createAdmin()
	{
		String name;
		String address;
		String mobile;
		int age;
		String mail;
		String password;
		System.out.print("Admins name - ");
		name = input.nextLine();
		System.out.print("Admins address - ");
		address = input.nextLine();
		System.out.print("Admins mobile - ");
		mobile = input.nextLine();
		System.out.print("Admins age - ");
		age = input2.nextInt();
		System.out.print("Admins mail - ");
		mail = input.nextLine();
		System.out.print("Admins password - ");
		password = input.nextLine();
		return (new Admin(name, address, mobile, age, mail, password));
	}

	public Hero findHero(String mail, String password)
	{
		for (Id id : ids)
		{
			if (id != null)
			{
				if (id instanceof Hero)
				{
					
					if (id.getMail().equals(mail) && id.getPassword().equals(password))
						return (Hero)id;
				}
			}
		}
		System.out.println("Invalid mail or password.");
		return null;
	}

	public Admin findAdmin(String mail, String password)
	{
		for (Id id : ids)
		{
			if (id != null)
			{
				if (id instanceof Admin)
				{
					
					if (id.getMail().equals(mail) && id.getPassword().equals(password))
						return (Admin)id;
				}
			}
		}
		System.out.println("Invalid mail or password.");
		return null;
	}

	public void showHeros()
	{
		for (Id id : ids)
		{
			if (id != null)
			{
				if (id instanceof Hero)
				{
					id.showInfo();
				}
			}
		}
	}
}