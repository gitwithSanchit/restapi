package com.om.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@RestController
@RequestMapping("/human")

public class humanResource {

    @Autowired
    private humanRepository repo;

    @PostMapping
    public Human save (@RequestBody Human h) {
        return repo.save(h);
    }

    @PutMapping
    public Human update(@RequestBody Human h) {
        return repo.save(h);
    }

    @GetMapping
    public List<Human> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Human getById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable int id) {
        repo.deleteById(id);
    }
}
