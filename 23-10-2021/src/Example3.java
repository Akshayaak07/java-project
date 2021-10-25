import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class Example3 
{

	public static void main(String[] args) 
	{

              Scanner scanner  = new Scanner(System.in);
              int output ;
              int payment =0 ;
              System.out.println("amount");
              int amount = scanner.nextInt();
             for (int i = 1; i <=3; i++)
           {
	                   payment = amount * 10 / 100;
	                  amount = amount -payment;
	                   System.out.println(amount);
           }
            output = amount - payment ;
            		System.out.println(output);
            scanner.close();
	}

}
