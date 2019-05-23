import be.blindbadger.Account;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();//een object aanmaken
        account.setBalance(new BigDecimal(1000750));//we hebben new BigDecimal gedaan,omdat het een klasse is
        //en we moeten zo doen om een value erin te initialiseren
        account.setCustomerName("Patrick Geudens");
        account.setId(1234567890L);//autoboxing

        AccountService service = new AccountService();//ik heb hier een object gemaakt voor de klassse die ik ga testen
        service.getBalance(account);
    }
}
