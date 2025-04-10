public class PersonalATM {
    private double balance;

    public PersonalATM(double intialBalance) {
        this.balance = intialBalance;
//        System.out.println("Initial balance: " + balance);
    }
    public void deposit(double amount){
        this.balance += amount;
//        System.out.println("Deposited: " + amount + ", New Balance: "+balance);
    }
//    public double deposit(){
//        return balance;
//    }
    public   void withdraw(double amount){
        this.balance -= amount;
//        System.out.println("Withdrew: " + amount + ", New Balance: "+balance);
    }
//    public double withdraw(){
//
//        return balance;
//    }
    public double checkBalance(){
        return balance;

    }
}
