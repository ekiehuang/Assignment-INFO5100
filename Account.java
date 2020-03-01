package hyj_assignment6;

public class Account {
    protected String firstName, lastName;
    protected double curBalance;

    public Account(String fname, String lname, double cb) {
        firstName = fname;
        lastName = lname;
        curBalance = cb;
    }

    public String getAcctType() {
        return this.getClass().getName();
    }

    public double DebitTransaction(double debitAmount) {
        curBalance = curBalance - debitAmount;
        return curBalance;
    }

    public double CreditTransaction(double creditAmount) {
        curBalance = curBalance + creditAmount;
        return curBalance;
    }

    public String toString()
    {
        return "Account name: " + firstName + " " + lastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", curBalance);
    }

    // Simple Unit Test
    public static void main(String[] args)
    {
        Account ac1 = new Account("John", "Smith", 100);
        System.out.println(ac1);

        ac1.DebitTransaction(30.25);
        System.out.println(ac1);

        ac1.CreditTransaction(10.10);
        System.out.println(ac1);
    }

}

