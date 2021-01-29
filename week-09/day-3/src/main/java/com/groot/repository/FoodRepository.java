package com.groot.repository;


import com.groot.model.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    Optional<Food> findByName(String name);
}
