package com.yilmazmehmet.StrategyFactoryExample.service.strategy;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;


public interface Strategy<T> {
    String getResponse();
    T getGenericResponse();
    StrategyName init();
}