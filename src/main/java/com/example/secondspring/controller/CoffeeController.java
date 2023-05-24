package com.example.secondspring.controller;

import com.example.secondspring.entity.Coffee;
import com.example.secondspring.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kevin")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @GetMapping("/coffees")
    public List<Coffee> renderAllCoffees() {
        return coffeeService.findAllCoffees();
    }
}
