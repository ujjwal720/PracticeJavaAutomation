package AssignmentsRivet;

public class Test {
    public static void main(String[] args) {

//        Deposit_Amount dpamount = new Deposit_Amount();
//        dpamount.Show_Account_Deails();
//        dpamount.Deposit_Amount(50000);
//        Withdraw_Amount wd = new Withdraw_Amount();
//        wd.Withdraw_Amount(5000);
        //wd.Show_Account_Deails();
        //wd.Deposit_Amount(50000);
        // wd.Withdraw_Amount(5000);
        Open_Account Oaccount = new Open_Account();
        Oaccount.Open_Account("Hiren", "Valsad", "Male", "Saving", 500000);
        Oaccount.display_Account_details();
        //wd.Deposit_Amount(wd.dpamount, wd.DepositType);
    }
 }