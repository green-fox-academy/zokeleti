package project.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<ShopItem> shopStock = new ArrayList<>();

    public List<ShopItem> getShopStock() {
        return shopStock;
    }


    public void setShopStock(List<ShopItem> shopStock) {
        this.shopStock = shopStock;
    }

    public void addItem(ShopItem item){
        this.shopStock.add(item);
    }
}
