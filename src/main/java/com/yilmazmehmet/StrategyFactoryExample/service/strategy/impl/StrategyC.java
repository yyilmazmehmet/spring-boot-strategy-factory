package com.yilmazmehmet.StrategyFactoryExample.service.strategy.impl;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;
import com.yilmazmehmet.StrategyFactoryExample.service.strategy.Strategy;
import org.springframework.stereotype.Service;

@Service
public class StrategyC implements Strategy<Integer>  {

    @Override
    public String getResponse() {
        return "I am instance of StrategyC";    }

    @Override
    public Integer getGenericResponse() {
        return 2+2;
    }

    @Override
    public StrategyName init() {
        return StrategyName.StrategyC;
    }
}
