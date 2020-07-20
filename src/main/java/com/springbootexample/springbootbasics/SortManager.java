package com.springbootexample.springbootbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class SortManager {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SortAlgorithm sortAlgorithm;

    int getSortedElement(final int[] source, final int searchKey)
        {
            logger.info("applySorting Method has been Invoked!");
            return sortAlgorithm.getSortedElement(source,searchKey);
        }
}
