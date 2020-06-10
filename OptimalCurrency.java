/* 
 *	OptimalCurrency.java - breaks down any given value
 * of dollars provided into manageable
 * amount of bills and/or coins.
 *	Do while loop is introduced to this program
 * to give a user an ability to
 * enter multiple values for a conversion
 * without a need of restarting this program.
 * 
 *	User is asked either to continue
 *conversions or stop executing program
 *after each conversion.
 * 
 * Original used is GallonsToLitres.java
 * 
 * Edited by: Ivan Belov
 * StudentID: T00637195
 */ 
 
import java.util.Scanner;
 
public class OptimalCurrency
	{

	public static void main (String[] args)
		{         
			@SuppressWarnings("resource")
			Scanner cashScanner = new Scanner (System.in);   
			/* 
			 * above line creates 
			 * a Scanner object and attaches it to System.in
			*/
			@SuppressWarnings("resource")
			Scanner endCharScanner = new Scanner (System.in);
			/*
			 * declaration of a scanner
			 * to help determine
			 * continuation of a program
			 */
			
			double inputCash = 0.0;
			double moneyDeposited = 0.0;
			/* 
			 *  above variable declaration statement
			 *  helps with facilitation of mile amount
			 *  value provided by a user.
			 */
			byte tenDollarBills = 0;
			byte fiveDollarBills = 0;
			byte toonies = 0;
			byte loonies = 0;
			byte quarters = 0;
			byte dimes = 0;
			byte nickels = 0;
			byte pennies = 0;
			String line;
			char endConversionChar;
			
			System.out.print ("\n Welcome to \" Optimal Currency "
					+ " Converter\"! \n" );
			
			do
			{
				System.out.print ("\n Please deposit money"
						+ " to break down : ");
				
				inputCash = cashScanner.nextDouble();
				/*
				 * Above line of code accepts 
				 * cash to be converted                 
				 */
				moneyDeposited = inputCash;
				
				tenDollarBills = (byte) (inputCash/10);
				inputCash = inputCash - tenDollarBills*10;
				fiveDollarBills = (byte)(inputCash/5);
				inputCash = inputCash - fiveDollarBills*5;
				toonies = (byte)(inputCash/2);
				inputCash = inputCash - toonies*2;
				loonies = (byte)(inputCash/1);
				inputCash = inputCash - loonies*1;
				quarters = (byte)(inputCash/0.25);
				inputCash = inputCash - quarters*0.25;
				dimes = (byte)(inputCash/0.10);
				inputCash = inputCash - dimes*0.10;
				nickels = (byte)(inputCash/0.05);
				inputCash = inputCash - nickels*0.05;
				pennies = (byte)(inputCash/0.01);
	  
				System.out.println (" \n Converted: $ " + moneyDeposited + " Currency provided "
						+ " : \n "
						+ "\t " + tenDollarBills + " $10 bill(s) \n"
						+ "\t " + fiveDollarBills + " $5 bill(s) \n"
						+ "\t " + toonies + " toonie(s) \n"
						+ "\t " + loonies + " loonie(s) \n"
						+ "\t " + quarters + " quarter(s) \n"
						+ "\t " + dimes + " dime(s) \n"
						+ "\t " + nickels + " nickel(s) \n"
						+ "\t " + pennies + " pennie(s) \n");
				
				byte i = 32;
				while (i>0)
				{
					System.out.print("*");
					i--;
				}
				/*
				 * Above while loop
				 * is in charge
				 * of drawing a
				 * separator between
				 * conversions
				 */
				System.out.print(" \r Would you like "
						+ " \r to convert more currency? "
						+ "\r (Y/N) : ");
				line = endCharScanner.nextLine();
				endConversionChar = line.charAt(0);
				
				/*
				 * Above Char Scanner code
				 * for giving user a choice
				 * to either continue
				 * or terminate conversion program
				 * was seen here:
				 * https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
				 * this code was adjusted
				 * to suit a new purpose 
				 */
				if (endConversionChar == 'n'||endConversionChar == 'N')
				{
					System.out.print("\nExit.");
					Runtime.getRuntime().exit(0);
				}
			}
			while (endConversionChar == 'y'||endConversionChar == 'Y');
			{
				inputCash = 0.0;
				moneyDeposited = 0.0;
				endConversionChar = 0;
				endCharScanner.reset();
				cashScanner.reset();
			}


		}// end of main() 
	}// end of class 