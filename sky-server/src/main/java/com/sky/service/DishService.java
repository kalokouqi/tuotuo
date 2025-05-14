package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
public interface DishService {

    /**
     * 新增菜品对应的口味
     *
     * @param dishDTO
     */
  public void saveWithFlavor(DishDTO dishDTO);
}
