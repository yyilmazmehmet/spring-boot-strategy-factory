package com.yilmazmehmet.StrategyFactoryExample.service.strategy.impl;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;
import com.yilmazmehmet.StrategyFactoryExample.service.strategy.Strategy;
import org.springframework.stereotype.Service;

@Service
public class StrategyB implements Strategy {

    @Override
    public String getResponse() {
        return "I am instance of StrategyB";    }

    @Override
    public StrategyName init() {
        return StrategyName.StrategyB;
    }
}
