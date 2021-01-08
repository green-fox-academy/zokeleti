package lionking.demo.controller;

import lionking.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccount bankAccount = new BankAccount("Simba", Double.valueOf(2000), "Lion" , "Zebra", true, true);
    List<BankAccount> accounts = new ArrayList<>();

    public BankAccountController(){
        accounts.add(new BankAccount("Simba", Double.valueOf(2000), "Lion", "Zebras", false, true));
        accounts.add(new BankAccount("Pumba", Double.valueOf(2), "Boar", "Insects", false, true));
        accounts.add(new BankAccount("Zordon", Double.valueOf(15), "Lion", "Zebras", false, false));
        accounts.add(new BankAccount("Timon", Double.valueOf(15), "Meercat", "Insects", false, true));
        accounts.add(new BankAccount("Mufasa", Double.valueOf(15), "Lion", "Zebras", true, true));

    }

    @GetMapping("/show")
    public String showAccount(Model model){
        model.addAttribute("bankAccount", bankAccount);
        return "index";
    }


    @GetMapping ("/accounts")
    public String showAccounts(Model model) {
        model.addAttribute("accounts", accounts);

        return "accounts";
    }

    @GetMapping("/ception")
    public String showSimplePage(Model model){
        model.addAttribute("ception", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
        return "ception";
    }
}
