package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    List<BankAccount> bankAccounts;

    public BankAccountController(){

        this.bankAccounts = new ArrayList<>();

        this.bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true ));
        this.bankAccounts.add(new BankAccount("Timon", 200, "mungoose", false, true));
        this.bankAccounts.add(new BankAccount("Pumba", 350, "wart-hog", false, true));
        this.bankAccounts.add(new BankAccount("Ed", 800, "hyena", false, false));
        this.bankAccounts.add(new BankAccount("Mufasa", 3000, "lion", true, true));
        this.bankAccounts.add(new BankAccount("Zazu", 1000, "toucan", false, false));
        this.bankAccounts.add(new BankAccount("Nala", 1500, "lion", false, true));
        this.bankAccounts.add(new BankAccount("Shenzi", 900, "hyena", false, false));
    }

    @RequestMapping(value = "/bank")
    public String showBankAccount(Model model){

        model.addAttribute("bankAccount", bankAccounts.get(0));

        return "bank";
    }

    @RequestMapping(value = "/string")
    public String showString (Model model){

        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

        return "string";
    }
    @GetMapping(value = "/bank/accounts")
    public String showAccounts(Model model){
        model.addAttribute("bankAccounts", bankAccounts);

        return "bankAccounts";
    }
}
