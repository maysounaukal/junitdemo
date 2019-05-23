import be.blindbadger.Account;
import be.blindbadger.BalanceInsufficientException;
import org.junit.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountServiceTest {//deze klasse om te testen waarin Annotations en Assertions toegevoegd worden

    //AccountService GAAN TESTEN
    @Test//als dit verwijderd wordt, de sigen groen verwijdert
    public void viewBalance(){
        Account account = new Account();
        account.setBalance(new BigDecimal("1000"));
        AccountService accountService = new AccountService();
      //  assert                    //check (keywoord van Java zelf)
        String result = accountService.getBalance(account);//string in de methode, dan gaat het String zijn

        assertEquals("1000",result);

    }
    @Test
    public void getBalance_withDecimal_roundedTwoDigits(){
        Account account = new Account();
        account.setBalance(new BigDecimal("123.5678"));//aytoBoxing(double)in de actualvalue double verschijnt
        String result = new AccountService().getBalance(account);
        assertEquals("123.5678",result);//die excpectedvalue is niet correct , daarom moeten wij de volgende stap doen

    }

    @Test
    public void changeBalance_deposit(){

        accountService.addToBalance(account, new BigDecimal(1000));//storting van 1000 euro
        //dan in de rekening  zal 2000 zijn
       assertEquals(account.getBalance(), new BigDecimal(2000));
       //asserEquals(expectedvalue,actualvalue)


    }
    @Test(expected = BalanceInsufficientException.class)
    //hebben we dat gemaakt , omdat exception is unchecked in exception class
    public void substractBalance_InsufficientBalance() throws BalanceInsufficientException{//moet hier throws zijn

            accountService.substractFromBalance(account, new BigDecimal("2000"));//gooit try catch

        }

    private Account account;
    private  AccountService accountService;
    @Before//voor elke test moet dit methode uitgevoerd worden
    public void init(){//we hebben een methode aangemaken (moet void zijn)
        System.out.println("Before method");
        account = new Account();
        account.setBalance(new BigDecimal(1000));

        accountService = new AccountService();//stateless
    }
    //na elke test moet dit methode uitgevoerd worden
    @After
    public void tearDown(){
        System.out.println("After method");
    }
    @BeforeClass//die methode wordt uitgevoerd voor het begin van alle testen
    public static void beforeTheClass(){

    }
    @AfterClass//die methode wordt uitgevoerd na het einde van alle testen
    public static void initClass(){
        System.out.println();
    }

}