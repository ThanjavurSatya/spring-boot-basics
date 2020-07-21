package com.springbootexample.springbootbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class QuickSortImpl implements SortAlgorithm{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public int getSortedElement(int[] source,int searchKey)
    {
        logger.info(AlgorithmType.QUICKSORT.toString() + " Algorithm is applied!");
        return 3;
    }
}
