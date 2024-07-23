package bank;

public class BankAccount {
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    // State
    private Integer accountNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    private Integer balance;

    // Behaviour
    public void transfer(Integer amount, BankAccount destination){
        this.withdraw(amount);
        destination.deposit(amount);
    }

    private void withdraw(Integer amount){
        this.balance -= amount;
    }

    private void deposit(Integer amount){
        this.balance += amount;
    }
}

//Access modifiers - public, private
