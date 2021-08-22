import java.util.*;
public class Sender extends User
{

	public Sender()
	{
		super("Unknown", "Unknown", "Unknown");
	}

	public Sender(String name, String address, String mobile)
	{
		super(name, address, mobile);
	}

	
	

	public void showInfo()
	{
		
		System.out.println("Senders Info -");
		super.showInfo();
	}
}