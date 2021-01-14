package dependecyinjection.dinject.controller;

import dependecyinjection.dinject.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {
    private static UtilityService utilityService;

    @Autowired
    public void UsefulUtilitiesControler(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String index(){

        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(Model model, @RequestParam String email){
        String[] result = utilityService.emailValidator(email);
        model.addAttribute("message", result[0]);
        model.addAttribute("color", result[1]);
        return "email";
    }

    @GetMapping("/useful/encode")
    public String ceasar(Model model, @RequestParam String toenCode, @RequestParam Integer key){
        String coded = utilityService.caesar(toenCode, key);
        model.addAttribute("codedtext", coded);
        return "useful";
    }



}
