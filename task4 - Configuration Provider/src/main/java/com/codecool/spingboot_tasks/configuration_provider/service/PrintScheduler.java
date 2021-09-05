package com.codecool.spingboot_tasks.configuration_provider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PrintScheduler {

    private static final Logger log = LoggerFactory.getLogger(PrintScheduler.class);

    @Scheduled(fixedRate = 2000)
    public void print() {
        log.info("Processing");
    }
}
