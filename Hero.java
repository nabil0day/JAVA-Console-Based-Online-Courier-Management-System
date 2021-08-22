public class Hero extends Id {
	private Parcel[] parcelsPicked;

	public Hero()
	{
		super();
		parcelsPicked = new Parcel[10];
	}
	public Hero(String name, String address, String mobile, int age, String mail, String password)
	{
		super(name, address, mobile, age, mail, password);
		parcelsPicked = new Parcel[10];
	}

	
	public void showParcelsPicked()
	{
		for (Parcel parcel : parcelsPicked)
		{
			int index = 1;
			if (parcel != null && !(parcel.getTrack().equals("Delivered")))
			{
				System.out.println(index + ". Sender name - " + parcel.getSender().getName() +
				" Reciver name - " + parcel.getReciver().getName() + "\n Hub - " + parcel.getHub() +
				" Destination - " + parcel.getDestination() + "\n Catagory - " + parcel.getCatagory() +
				" Approx Weight - " + parcel.getAproxweight() + "\n Estimated Delivery Date - " + parcel.getEstimatdDeliveryDate());
			}
		}
	}

	public void addParcelsPicked(Parcel parcel)
	{
		
		for (int i = 0; i < 10; i++)
		{
			if (parcelsPicked[i] == null)
			{
				parcelsPicked[i] = parcel;
				break;
			}
		}
	}

	public Parcel removeParcelsPicked(int index)
	{
		int i = 1;
		for (Parcel parcel : parcelsPicked)
		{
			if (parcel != null)
			{
				if (i == index)
				{
					parcel = null;
					System.out.println("Delivered");
					return parcel;
				}
				else
					i++;
			}
		}
		return null;
	}

	public void showInfo()
	{
		
		System.out.println("Heros info -");
		super.showInfo();
	}
}