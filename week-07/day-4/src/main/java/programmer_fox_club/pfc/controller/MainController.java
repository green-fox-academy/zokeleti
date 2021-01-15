package programmer_fox_club.pfc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import programmer_fox_club.pfc.model.Fox;
import programmer_fox_club.pfc.service.FoxService;

@Controller
public class MainController {

    FoxService foxService = new FoxService();

    @GetMapping("/index")
    public String home(@RequestParam String name, Model model){
        Fox foxy = foxService.findFoxByName(name);
        model.addAttribute("name", foxy.getName());
        model.addAttribute("food", foxy.getFood());
        model.addAttribute("drink", foxy.getDrink());
        model.addAttribute("numberoftricks", foxy.getListOfTricks().size());
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name){
        foxService.addFox(foxService.findFoxByName(name));
        return "redirect:/index?name="+name;
    }

    @GetMapping("/nutritionstore")
    public String getNutritionStore(@RequestParam String name, Model model){
        model.addAttribute("name", foxService.findFoxByName(name).getName());
        model.addAttribute("foods", foxService.getFoodList());
        model.addAttribute("drinks", foxService.getDrinkList());
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String postNutritionStore(@RequestParam String name, String food, String drink){
        foxService.findFoxByName(name).setFood(food);
        foxService.findFoxByName(name).setDrink(drink);
        return "redirect:/index?name="+name;
    }

}
