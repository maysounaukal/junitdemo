package be.blindbadger;
//om een project met maven aan te maken(new ->project->maven->groupID(naam van package),ArtifactId(naam van project)
import java.math.BigDecimal;

public class Account {
    private long id;
    private String customerName;
    private BigDecimal balance;//BigDecimal is een klasse om nauwkeurige value te geven


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
