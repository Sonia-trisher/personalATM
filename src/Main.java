
public class Main {
    public static void main(String[] args) {
        PersonalATM ATM = new PersonalATM(100);
        System.out.println("Initial balance: " + ATM.checkBalance());
        ATM.deposit(50);
        System.out.println("Deposited: " + 50 + ", New Balance: "+ATM.checkBalance());
//        System.out.println(ATM.withdraw(30));
        ATM.withdraw(30);
        System.out.println("Withdrew: " + 30 + ", New Balance: "+ATM.checkBalance());

//        System.out.println(ATM.checkBalance());
    }
}