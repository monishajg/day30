package ibf2022.paf.day30.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ibf2022.paf.day30.model.Transfer;
import ibf2022.paf.day30.repository.AccountsRepository;
import ibf2022.paf.day30.service.FundsTransferService;
import jakarta.validation.Valid;

@Controller
public class FundsTransferController {

    @Autowired
    private FundsTransferService transferService;
    
    @Autowired
    private AccountsRepository accountsRepo;

    @GetMapping(path={"/", "/index.html"})
    public String getLandingPage (Model model) {
    model.addAttribute("transfer", new Transfer());
    return "index";
    }
    
    @PostMapping(path = "/transfer", consumes = "application/x-www-form-urlencoded", produces = "text/html")
    public String processTransfer (@Valid @ModelAttribute("transfer") Transfer transfer, BindingResult bind, Model model) {
    if(bind.hasErrors()){
    model.addAttribute("transfer", transfer);
    
    public String transferFunds(@RequestParam("from") String fromAccount,
    @RequestParam("to") String toAccount,
    @RequestParam("amount") double amount) {

    // check if both accounts exist
    if (!checkAccountExistence(fromAccount) || !checkAccountExistence(toAccount)) {
    return "One or both of the accounts do not exist.";
    }
    
    // check account number length
    if (!checkAccountNumberLength(fromAccount) || !checkAccountNumberLength(toAccount)) {
    return "One or both of the account numbers are not 10 characters long.";
    }
    
    // perform transfer
    // transferFunds(fromAccount, toAccount, amount);
    
    return "Funds transfer successful.";
    }
    
    private boolean checkAccountExistence(String accountNumber) {
    // check if account exists
    return true; // replace with actual implementation
    }
    
    private boolean checkAccountNumberLength(String accountNumber) {
    return accountNumber.length() == 10;
    }
    
    return "index";
    }
    return "view1";
    }
    
}