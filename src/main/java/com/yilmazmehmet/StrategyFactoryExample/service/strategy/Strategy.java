package com.yilmazmehmet.StrategyFactoryExample.service.strategy;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;


public interface Strategy {
    String getResponse();

    StrategyName init();
}
