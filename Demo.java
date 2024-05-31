package Practice;
import java.util.Scanner;

class Balance
{
	String name;
	int empid;
	int balance;
	Scanner sc=new Scanner(System.in);
	public void display()
	{
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Employee ID :");
		empid=sc.nextInt();
		System.out.println("Enter Balance :");
		balance=sc.nextInt();
		System.out.println("\nEmployee Name :"+name+"\nEmployee empid :"+empid+
				"\nBalance :"+balance);
	}
}

class Loan extends Balance
{
	int loan_amount;
	public void loan_amount()
	{
		System.out.println("Enter Loan Amount :");
		loan_amount = sc.nextInt();
		int available_balance=balance-loan_amount;
		System.out.println("Available Balance is :"+available_balance);
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Loan emp1=new Loan();
		emp1.display();
		emp1.loan_amount();
	}

}
