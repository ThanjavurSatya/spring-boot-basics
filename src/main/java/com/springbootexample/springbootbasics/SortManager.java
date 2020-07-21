package com.springbootexample.springbootbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class SortManager {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("Bubble")
    private SortAlgorithm sortAlgorithm;

    int getSortedElement(final int[] source, final int searchKey)
        {
            logger.info("applySorting Method has been Invoked!");
            return sortAlgorithm.getSortedElement(source,searchKey);
        }
}
