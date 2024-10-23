package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public Fruit createFruit(@RequestBody Fruit fruit) {
        return fruitService.createFruit(fruit);
    }

    @GetMapping("/getAll")
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/getOne/{id}")
    public Fruit getFruitById(@PathVariable int id) {
        return fruitService.getFruitById(id);
    }

    @PutMapping("/update/{id}")
    public Fruit updateFruit(@PathVariable int id, @RequestBody Fruit fruit) {
        return fruitService.updateFruit(id, fruit);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
    }
}