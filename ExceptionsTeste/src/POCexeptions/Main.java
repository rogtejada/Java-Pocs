package POCexeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Account acc1 = null;
		
		while(acc1 == null) {
			try {
				System.out.println("Enter account data:");
				System.out.print("Number: ");
				int number = Integer.parseInt(s.nextLine());
				System.out.print("Holder: ");
				String holder = s.nextLine();
				System.out.print("Initial Balance: ");
				Double balance = Double.parseDouble(s.nextLine());
				System.out.print("Withdraw Limit: ");
				Double withdrawLimit = Double.parseDouble(s.nextLine());
				acc1 = new Account(number, holder, balance, withdrawLimit);
			}catch(NumberFormatException e) {
				System.out.println("Invalid Input");
			}
		}
		while(acc1.getValid()==false) {
			try {				
				System.out.println("   ----   ");
				System.out.print("Enter amount for withdrawt: ");
				acc1.withdraw(Double.parseDouble(s.nextLine()));
				System.out.println("New Balance: " + acc1.getBalance());
				
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input");
			} catch (NumberFormatException e) {
				System.out.println("This must be a number");
			}
		}
		s.close();
	}

}
