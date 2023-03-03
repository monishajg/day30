package ibf2022.paf.day30.model;

import java.math.BigDecimal;

import javax.management.loading.PrivateClassLoader;

import org.springframework.util.MultiValueMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.jdbc.support.rowset.SqlRowSet;

@Data
@NoArgsConstructor //uncomment both when variables listed 
@AllArgsConstructor
public class Accounts {
    
    private String accountId;
    
    private String name;
    
    private BigDecimal balance;
    
}
