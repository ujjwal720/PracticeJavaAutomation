package AssignmentsRivet;

import java.util.Random;
import java.util.Scanner;

public class Open_Account {

    public String Account_Holder_Name;
    public String Address;
    public String Gender;
    public long Mob;
    public long Account_Number;
    public long balance;
   public String Account_Type;

    Scanner scn = new Scanner(System.in);
  public void Open_Account()
  {

       System.out.println("Enter Account Holder Name: ");
       this.Account_Holder_Name = scn.next();
     Random rand = new Random();
       this.Account_Number = (100000000000L) + (long) (rand.nextDouble() * 90000000000L);

       System.out.println("Account Number is: "+ Account_Number);

       System.out.println("Enter Address: ");
       this.Address = scn.next();

       System.out.println("Enter Gender: ");
      this.Gender = scn.next();

       System.out.println("Enter money you have to deposit while account opening: ");
        this.balance = scn.nextLong();
   }
    public void Open_Account(String Account_Holder_Name, String address, String Gender, String Account_Type, long balance)
    {
        System.out.println("Enter Name: ");
        this.Account_Holder_Name = Account_Holder_Name;

        Random rand = new Random();
        this.Account_Number = (100000000000L) + (long) (rand.nextLong() * 900000000000L);

        System.out.println("Enter Addresss: ");
        this.Address = address;

        System.out.println("Enter Gender: ");
        this.Gender = Gender;

        System.out.println("Enter money you have to deposit while account opening: ");
        this.balance = balance;
    }
    public void display_Account_details()
    {
        System.out.println("Name: " + this.Account_Holder_Name);
        System.out.println("Account Number: "+ this.Account_Number);
        System.out.println("Address: " + this.Address);
        System.out.println("Gender: " + this.Gender);
        System.out.println("Your current balance is: " + this.balance);
    }
}
