public abstract class User {
	protected String name;
	protected String address;
	private String mobile;

	public User(String name, String address, String mobile)
	{
		this.name = name;
		this.address = address;
		this.mobile=mobile;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()

	{
		return address;
	}

	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}

	public String getMobile()
	{
		return mobile;
	}

	
	public void showInfo()
	{
		System.out.println("Name - " + name);
		System.out.println("Address -" + address);
		System.out.println("Mobile - " + mobile);
	}
}