package com.example.secondspring.service;

import com.example.secondspring.entity.Coffee;
import com.example.secondspring.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public List<Coffee> findAllCoffees() {
        return coffeeRepository.findAll();
    }
}
