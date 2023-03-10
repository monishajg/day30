package ibf2022.paf.day30.model;

import java.math.BigDecimal;

import javax.management.loading.PrivateClassLoader;

import org.springframework.util.MultiValueMap;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.jdbc.support.rowset.SqlRowSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
    
    //@Size(min = 10, max = 10, message = "Length of accountId should be 10 characters")
    protected String accountId;
    
    protected String name;
    
    //@Size(min = 10, message = "Min transfer is $10. Insufficient balance")
    private BigDecimal balance;

}
