package ibf2022.paf.day30.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ibf2022.paf.day30.model.Accounts;
import ibf2022.paf.day30.model.Transfer;

//@Repository
public class AccountsRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    // (a) get all the accounts
    private String getAllSQL = "SELECT * FROM accounts";
    
    // (b) get account by account Id
    private String getAccountByIdSQL = "SELECT * FROM accounts WHERE account_id = ?";
    
    // (a) get all the accounts
    public List<Accounts> getAll() {
        List<Accounts> resultList = new ArrayList<Accounts>();
        resultList = jdbcTemplate.query(getAllSQL, BeanPropertyRowMapper.newInstance(Accounts.class)); //queryForObject returns 1, use query instead
        return resultList;
    }
    
    // (b) get account by account Id
    public List<Accounts> getAccountById(String accountId) {
        List<Accounts> resultList = new ArrayList<Accounts>();
        resultList = jdbcTemplate.query(getAccountByIdSQL, BeanPropertyRowMapper.newInstance(Accounts.class), accountId);
        return resultList;
    }
    
    
    
    // @Override
    // public List<Accounts> retrieveAccountsList() {
    // }
    
}