import be.blindbadger.Account;
import be.blindbadger.BalanceInsufficientException;

import java.math.BigDecimal;

//AccountSService doet drie functies
    public class AccountService{//interactie met accounts
        //hycohiegeen
        public String getBalance(Account account){
           // System.out.println(account.getBalance());//interactie met gebruiker
         return account.getBalance().toString();
        }
        public void changeBalance(Account account, BigDecimal value){
            account.setBalance(account.getBalance().add(value));//interactie met account

        }
        public void transfer(Account source, Account target,BigDecimal amount){
            source.setBalance(source.getBalance().subtract(amount));
            target.setBalance(target.getBalance().add(amount));//interactie met account

        }

   public void addToBalance(Account account, BigDecimal value) {

                account.setBalance(account.getBalance().add(value));
   }
   public void substractFromBalance(Account account, BigDecimal value) throws BalanceInsufficientException{
            if(account.getBalance().doubleValue() < value.doubleValue())//als in mijn rekening geen genoeg geld om af te trekken
                throw new BalanceInsufficientException("Dat boi broke...#BranTheBran");
            account.setBalance(account.getBalance().subtract(value));
   }
}

