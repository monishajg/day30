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
import jakarta.validation.Valid;

// import ibf2022.paf.day30.service.FundsTransferService;

@Controller
public class FundsTransferController {

    //@Autowired
    //private FundsTransferService trnsService;

    @GetMapping(path={"/", "/index.html"})
    public String getLandingPage (Model model) {
    model.addAttribute("transfer", new Transfer());
    return "index";
    }
    
    @PostMapping(path = "/transfer", consumes = "application/x-www-form-urlencoded", produces = "text/html")
    public String processTransfer (@Valid @ModelAttribute("transfer") Transfer transfer, BindingResult bind, Model model) {
    if(bind.hasErrors()){
    model.addAttribute("transfer", transfer);
    return "index";
    }
    return "view1";
    }
    
}