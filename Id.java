public abstract class Id extends User{
	private String mail;
	private String password;
	private int age;

	public Id()
	{
		super("Unknown", "Unknown", "Unknown");
		this.mail = "Unknown";
		this.password = "Unknown";
	}

	public Id(String name, String address, String mobile, int age, String mail, String password)
	{
		super(name, address, mobile);
		this.age = age;
		this.mail = mail;
		this.password = password;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}

	public void setMail(String mail)
	{
		this.mail=mail;
	}

	public String getMail()

	{
     return mail;
	}

	public void setPassword(String password)
	{
		this.password=password;
	}

	public String getPassword()

	{
		return password;
	}

	
	public void showInfo()
	{
		super.showInfo();
	}
}