package com.yilmazmehmet.StrategyFactoryExample.controller;

import com.yilmazmehmet.StrategyFactoryExample.factory.StrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final StrategyFactory strategyFactory;

    @Autowired
    public MainController(StrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome ";
    }

    @GetMapping("/strategy")
    @ResponseBody
    public String getStrategyByType(@RequestParam String type) {
        return strategyFactory.findStrategyByType(type).getResponse();
    }

    @GetMapping("/strategy/generic")
    @ResponseBody
    public ResponseEntity<?> getGenericStrategyByType(@RequestParam String type) {
        return ResponseEntity.ok(strategyFactory.findStrategyByType(type).getGenericResponse());
    }
}
