package com.yilmazmehmet.StrategyFactoryExample.service.strategy.impl;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;
import com.yilmazmehmet.StrategyFactoryExample.service.strategy.Strategy;
import org.springframework.stereotype.Service;

@Service
public class StrategyA implements Strategy<Double> {

    @Override
    public String getResponse() {
        return "I am instance of StrategyA";
    }

    @Override
    public Double getGenericResponse() {
        return 5/2d;
    }

    @Override
    public StrategyName init() {
        return StrategyName.StrategyA;
    }
}
