package ibf2022.paf.day30.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transfer extends Accounts{
    
    private String transferId;
    
    //@NotBlank(message = "Please select an account.")
    public void fromAccount(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }
    
    //@NotBlank(message = "Please select an account.")
    public void toAccount(String name, String accountId) {
        this.name = name;
        this.accountId = accountId;
    }
    
    //@Min(value = 10, message = "Min transfer amount is $10")
    private BigDecimal amount;
    
    private String comments;
    
}
