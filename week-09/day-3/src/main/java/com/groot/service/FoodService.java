package com.groot.service;

import com.groot.model.Food;
import com.groot.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void removeFood(String name){
        Optional<Food> food = repo.findByName(name);
        if(food.isPresent()){
            Food foodToDelete = food.get();
            repo.delete(foodToDelete);
        }


    }

    public void changeAmount(String name, Integer amount){
        Optional<Food> food = repo.findByName(name);
        if (food.isPresent()){
            Food foodToUpdate = food.get();
            foodToUpdate.setAmount(amount);
            repo.save(foodToUpdate);
        }


    }


}
