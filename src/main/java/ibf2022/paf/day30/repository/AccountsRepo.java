package ibf2022.paf.day30.repository;

import java.util.List;

import ibf2022.paf.day30.model.Accounts;

public interface AccountsRepo {
    
    List<Accounts> retrieveAccountsList();
    
}