package com.example.shedlockdemo.adapters.driver;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Scheduled(fixedRate = 5000)
    @SchedulerLock(name = "scheduledTask", lockAtLeastFor = "3s")
    public void run() {
        System.out.println("Scheduled task running at " + System.currentTimeMillis());
    }
}
