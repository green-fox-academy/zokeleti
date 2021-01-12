package project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.demo.model.ShopItem;
import project.demo.model.Stock;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


@Controller
public class MyShopController {
    private Stock shopStock = new Stock();
    private Boolean priceInEuros = true;

    public MyShopController() {
        shopStock.addItem(new ShopItem("basketball", "A ball used to play basketball", 10.0, 25, "sport accessory"));
        shopStock.addItem(new ShopItem("football", "A ball used to play football", 12.0, 12, "sport accessory"));
        shopStock.addItem(new ShopItem("nike shoes", "A pair of comfy shoes", 45.0, 5,"sport accessory"));
        shopStock.addItem(new ShopItem("ping-pong balls(5pcs)", "5pcs pack of ping pong balls", 10.0, 30,"sport accessory"));
        shopStock.addItem(new ShopItem("taco", "Traditional mexican meal", 3.0, 1, "food"));
        shopStock.addItem(new ShopItem("gulyás soup", "Traditional hungarian meal", 4.0, 9, "food"));
        shopStock.addItem(new ShopItem("space ship", "Space transport vehicle", 5000000.0, 2, "vehicle"));


    }

    @GetMapping("/index")
    public String show(Model model){
        model.addAttribute("shopStock", shopStock.getShopStock());
        return "shop";
    }

    @GetMapping("/onlyavailable")
    public String onlyAvailable(Model model){
        List<ShopItem> available =  shopStock.getShopStock()
                .stream()
                .filter(i -> i.getQuantity()>0)
                .collect(Collectors.toList());
        model.addAttribute("shopStock", available);
        return "shop";
    }

    @GetMapping("/cheapestfirst")
    public String cheapestFirst(Model model){
        List<ShopItem> sortedByPrice = shopStock.getShopStock()
                .stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", sortedByPrice);
        return "shop";
    }

    @GetMapping("/containsnike")
    public String containsNike(Model model){
        List<ShopItem> containsNike = shopStock.getShopStock()
                .stream()
                .filter(i -> i.getName().toLowerCase().contains("nike") || i.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", containsNike);
        return "shop";
    }

    @GetMapping("/average")
    public String average(Model model){
        Double averageStock = shopStock.getShopStock()
                .stream()
                .mapToDouble(ShopItem::getQuantity)
                .average()
                .orElse(0);
        model.addAttribute("message", "Average stock quantity is: " + averageStock);
        return "average";
    }

    @GetMapping("/mostexpensive")
    public String mostExpensive(Model model){
        ShopItem mostExpensive = shopStock.getShopStock()
                .stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .orElseThrow(NoSuchElementException::new);
        model.addAttribute("mostexpensive", mostExpensive);
        return "average";
    }
    @PostMapping("/search")
    public String search( @RequestParam String searchterm, Model model){
        String lowerSearch = searchterm.toLowerCase().trim();
        List<ShopItem> containsTerm = shopStock.getShopStock()
                .stream()
                .filter(i -> i.getName().toLowerCase().contains(lowerSearch) || i.getDescription().toLowerCase().contains(lowerSearch))
                .collect(Collectors.toList());
        if (containsTerm.isEmpty()){
            model.addAttribute("message", "There's no match for the given keyword.");
            return "average";
        }
        model.addAttribute("shopStock", containsTerm);
        return "shop";
    }

    @GetMapping("/food")
    public String showFood(Model model){
        List<ShopItem> foods = shopStock.getShopStock()
                .stream()
                .filter(i -> i.getType().toLowerCase().contains("food"))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", foods);
        return "extrafeatures";
    }

    @GetMapping("/sportaccessories")
    public String showSportAccessories(Model model){
        List<ShopItem> sportAccessories = shopStock.getShopStock()
                .stream()
                .filter(i -> i.getType().toLowerCase().contains("sport"))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", sportAccessories);
        return "extrafeatures";
    }

    @GetMapping("/vehicles")
    public String showVehicles(Model model){
        List<ShopItem> vehicles = shopStock.getShopStock()
                .stream()
                .filter(i -> i.getType().toLowerCase().contains("vehicle"))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", vehicles);
        return "extrafeatures";
    }

    @GetMapping("/forints")
    public String showInOriginal(Model model){
        List<ShopItem> stockInForints = shopStock.getShopStock()
                .stream()
                .map(i -> new ShopItem(i.getName(), i.getDescription(), i.getPrice() * 350 , i.getQuantity(), i.getType()))
                .collect(Collectors.toList());
        model.addAttribute("shopStock", stockInForints);
        return "extrafeatures";
    }

    @GetMapping("/euros")
    public String showInEuros(Model model){
        model.addAttribute("shopStock", shopStock.getShopStock());
        return "extrafeatures";
    }

    @PostMapping("/searchbyvalue")
    public String searchByValue( @RequestParam String searchterm, Model model){
        Double searchValue = Double.parseDouble(searchterm);

        List<ShopItem> containsTerm = shopStock.getShopStock()
                .stream()
                .filter(i -> i.
                .collect(Collectors.toList());
        if (containsTerm.isEmpty()){
            model.addAttribute("message", "There's no match for the given keyword.");
            return "average";
        }
        model.addAttribute("shopStock", containsTerm);
        return "shop";
    }



}
