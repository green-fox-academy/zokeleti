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

    @PostMapping("/useful/encode")
    public String encode(Model model, @RequestParam String toEncode){

        return "encode";
    }
    @PostMapping("/useful/decode")
    public String decode(Model model, @RequestParam String toDecode){

        return "decode";
    }

}
