import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the days");
        int days = scanner.nextInt();
        int hours=days*24;
        int mins=hours*60;
        int secs=mins*60;
        System.out.println(secs);
        scanner.close();

	}

}
