package project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.demo.model.ShopItem;
import project.demo.model.Stock;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyShopController {
    Stock shopStock = new Stock();

    public MyShopController() {
        shopStock.addItem(new ShopItem("basketball", "ball", 10.0, 25));
        shopStock.addItem(new ShopItem("football", "ball", 12.0, 12));
        shopStock.addItem(new ShopItem("nike shoes", "shoes", 45.0, 5));
        shopStock.addItem(new ShopItem("ping-pong ball", "ball", 10.0, 30));
        shopStock.addItem(new ShopItem("taco", "mexican food", 3.0, 0));
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


}
