package com.yilmazmehmet.StrategyFactoryExample.factory;

import com.yilmazmehmet.StrategyFactoryExample.enums.StrategyName;
import com.yilmazmehmet.StrategyFactoryExample.service.strategy.Strategy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {

    private Map<StrategyName,Strategy> strategies;
    public StrategyFactory(Set<Strategy> strategySet) {
        createStrategy(strategySet);
    }

    public Strategy findStrategyByType(String strategyName) {
        return strategies.get(StrategyName.valueOf(strategyName));
    }

    private void createStrategy(Set<Strategy> strategySet) {
        strategies = new HashMap<>();
        strategySet.forEach( strategy -> strategies.put(strategy.init(), strategy));
    }
}
