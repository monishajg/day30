package ibf2022.paf.day30.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Transfer extends Accounts{
    
    private String transferId;
    
    public void fromAccount(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }
    
    
    public void toAccount(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }
    
    private BigDecimal amount;
    
    private String comments;
    
}
