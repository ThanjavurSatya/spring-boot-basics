package com.springbootexample.springbootbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")
public class BinarySearchImpl implements SortAlgorithm{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public int getSortedElement(int[] source,int searchKey)
    {
        logger.info(AlgorithmType.BINARY_SEARCH.toString() + " Algorithm is applied!!!");
        return 3;
    }
}
