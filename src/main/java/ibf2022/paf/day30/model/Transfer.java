package ibf2022.paf.day30.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public class Transfer extends Accounts{
    
    public from (String name, String accountId) {
    
    }
    
    public class to {
    
    }
    
    @DecimalMin(value = "0.01", inclusive = true, message = "Amount must be greater than or equal to 0.01")
    private BigDecimal amount;
    
    private String comments;
    
}
