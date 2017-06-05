
public class Accounts {

    public static void main(String[] args) {

        Account A = new Account("Account of A : ", 100);
        Account B = new Account("Account of B : ", 0);
        Account C = new Account("Account of C : ", 0);
        
        transfer(A,B,50);
        transfer(B,C,25);
        
        
       
    }

    public static void transfer(Account from, Account to, double howMuch) {
        
          from.withdrawal(howMuch);
          to.deposit(howMuch);
        
    }

}
