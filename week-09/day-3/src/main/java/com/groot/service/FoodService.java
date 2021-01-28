package com.groot.service;

import com.groot.model.Food;
import com.groot.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    FoodRepository repo;

    @Autowired
    public FoodService(FoodRepository repo){
        this.repo = repo;
    }

    public List<Food> getListOfFoods(){
        return (List<Food>) repo.findAll();
    }

    public void addFood(Food food){
        repo.save(food);
    }

    public void removeFood(Food food){
        repo.delete(food);
    }

    public void changeAmount(Food food, Integer amount){
        Food foodToUpdate = repo.findById(food.getId()).get();
        foodToUpdate.setAmount(amount);
        repo.save(foodToUpdate);
    }


}
