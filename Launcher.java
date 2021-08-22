import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Launcher {

	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	static ParcelsData parcelsData = new ParcelsData();
	static IdsData idsData = new IdsData();

	static void trackFuncs()
	{
		System.out.print("Enter Senders name - ");
		String senderName = input2.nextLine();
		System.out.print("Enter Senders mobile - ");
		String senderMobile = input2.nextLine();
		Clear.cls();
		parcelsData.findAndShowParcelDetails(senderName, senderMobile);
	}

	static void parcelFuncs()
	{
		int check2 = 0;
		while(check2 != 3)
		{
			System.out.println("1.Send.\n2.Track.\n3.Back.");
			try {
				check2 = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input.");
				check2 = 0;
			}
			Clear.cls();
			if (check2 == 0)
				continue;
			if (check2 == 1)
			{
				Parcel tempParcel = parcelsData.createParcel();
				keepRecord(tempParcel);
				parcelsData.addParcel(tempParcel);
			}
			else if (check2 == 2)
			{
				trackFuncs();
			}
			else if (check2 == 3)
				System.out.println("Going Back.");
			else
				System.out.println("Invalid input.");

		}
	}

	static void adminsFunctions()
	{
		int check2 = 0;
		while(check2 != 2)
		{
			System.out.println("1.Login.\n2.Back.");
			try {
				check2 = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input.");
				check2 = 0;
			}
			Clear.cls();
			if (check2 == 0)
				continue;
			if (check2 == 1)
			{
				System.out.print("Enter Admins mail - ");
				String mail = input2.nextLine();
				System.out.print("Enter Admins password - ");
				String password = input2.nextLine();
				Clear.cls();
				Admin tempAdmin = idsData.findAdmin(mail, password);
				if (tempAdmin != null)
				{
					idsData.showHeros();
				}
			}
			else if (check2 == 2)
				System.out.println("Going Back.");
			else
				System.out.println("Invalid input.");
		}
	}

	static void herosFunctions()
	{
		int check2 = 0;
		while(check2 != 2)
		{
			System.out.println("1.Login.\n2.Back.");
			try {
				check2 = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input.");
				check2 = 0;
			}
			Clear.cls();
			if (check2 == 0)
				continue;
			if (check2 == 1)
			{
				System.out.print("Enter Heros mail - ");
				String mail = input2.nextLine();
				System.out.print("Enter Heros password - ");
				String password = input2.nextLine();
				Clear.cls();
				Hero tempHero = idsData.findHero(mail, password);
				if (tempHero != null)
				{
					int check3 = 0;
					while(check3 != 4)
					{
						System.out.println("1.Show available Parcels.\n2.Show parcels to be delivered.\n3.Report Delivered.\n4.Back");
						try {
							check3 = input.nextInt();
						}
						catch (InputMismatchException e)
						{
							System.out.println("Invalid input.");
							check3 = 0;
						}
						Clear.cls();
						if (check3 == 0)
							continue;
						if (check3 == 1)
						{
							parcelsData.showUnconfirmedParcels();
							System.out.print("Enter Index to confirm - ");
							Parcel tempParcel = parcelsData.confirmParcel(input2.nextInt());
							if (tempParcel != null)
								tempHero.addParcelsPicked(tempParcel);
						}
						else if (check3 == 2)
						{
							tempHero.showParcelsPicked();
						}
						else if (check3 == 3)
						{
							tempHero.showParcelsPicked();
							System.out.print("Enter Index to report delivered - ");
							Parcel tempParcel = tempHero.removeParcelsPicked(input2.nextInt());
							if (tempParcel != null)
							{
								for (Parcel gotParcel : parcelsData.getParcels())
								{
									if (tempParcel == gotParcel)
									{
										parcelsData.removeParcel(tempParcel);
										tempParcel.setTrack("Delivered");
									}
								}
								
							}
						}
						else if (check3 == 4)
							System.out.println("Going Back.");
						else
							System.out.println("Invalid input.");
					}
				}
			}
			else if (check2 == 2)
				System.out.println("Going Back.");
			else
				System.out.println("Invalid input.");

		}
	}

	static void printTerms()
	{
		String text = "";
		try {
			FileReader reader = new FileReader(new File("Termsandconditions.txt"));
			BufferedReader bffrReader = new BufferedReader(reader);
			while (bffrReader.readLine() != null)
			{
				text += bffrReader.readLine() + "\n" + "\r";
			}
			System.out.print(text);
			reader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	static void keepRecord(Parcel parcel)
	{
		try
		{
			FileWriter writer = new FileWriter(new File("Records.txt"), true);
			writer.write("Parcel details -" + "\n" + "\r");
			writer.write("Sender - " + parcel.getSender().getName() + "\t" + " Reciver - " + parcel.getReciver().getName() + "\t" + " Destination - " + parcel.getDestination() + "\t" + " E.D.D. - " + parcel.getEstimatdDeliveryDate());
			writer.flush();
			writer.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner input2 = new Scanner(System.in);

		idsData.addId(new Admin("Tushar", "Dhaka", "017********", 21, "tushar@gmail.com", "java101"));
		idsData.addId(new Hero("Nabil", "Jessore", "018********", 19, "nabil@gmail.com", "ihacker"));

		int check = 0;
		while(check != 6)
		{
			System.out.println("1.Parcel.\n2.admin Login.\n3.Heros's Login.\n4.Terms & Condition.\n5.About Us.\n6.Exit.");
			try {
				check = input2.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("Invalid input.");
				check = 0;
			}

			Clear.cls();

			if (check == 1)
			{
				parcelFuncs();
			}
			else if (check == 2)
			{
				adminsFunctions();
			}
			else if (check == 3)
			{
				herosFunctions();
			}
			else if (check == 4)
			{
				printTerms();
				System.out.println("Enter 0 to go back - ");
				check = input.nextInt();
				Clear.cls();
			}
			else if (check == 5)
			{
				System.out.println("We are Fox Courier.");
				System.out.println("Enter 0 to go back - ");
				check = input.nextInt();
				Clear.cls();
			}
		}
	}
}