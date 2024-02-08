public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountNumber;
    private int balance = 0;

    private int amount;
    private String dateOfBirth;

    private int interest;

    private String accountType;

    private int overdraft;
    //constructor function
    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, int inputBalance, int inputAmount, String inputAccountType,  int inputOverdraft){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;
        this.amount = inputAmount;
        this.accountType = inputAccountType;
        this.overdraft = inputOverdraft;

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int deposit(int amount){
       balance = balance + amount;
        return balance ;
    }

    public int withdraw(int amount){

        if(balance>overdraft){
            balance = balance - amount;
        }
        if(balance<overdraft){
        return balance;
        }
        return balance;
    }



    public int payInterest( String accountType){
        if(accountType == "current"){
            interest = 3;
            balance = balance * interest;
            return balance;
        }
        if(accountType == "savings"){
            interest = 2;
            balance = balance * interest;
            return balance;
        }
        return balance;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

//    public double getInterest() {
//        return interest;
//    }

//    public void setInterest(int interest) {
//        this.interest = interest;
//    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
