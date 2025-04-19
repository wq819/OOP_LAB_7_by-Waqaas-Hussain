public class SavingsAccount extends Bank_account {
    double getInterestRate(){
        return 0.1;
    }
    public void display (){
        System.out.println("Savings Account Interest Rate: " + getInterestRate());
    }
}
