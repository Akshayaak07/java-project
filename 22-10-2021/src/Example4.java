public class Example4
{

	public static void main(String[] args)
	{
		int age = 18;
		String  status;
		switch (age)
		{
		case (age = 18):
			status = "Teenager";
			break;
		case (age > 18):
			status = "Adult";
		    break;
		case (age < 18):
			status = "Childern";
		    break;	
		default:
			status = "No Status";
			break;
		}

	}
		System.out.println("status");

}
