package com.luo.springboot04task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author：罗金星 date 2019/1/25 14:32
 **/
@Service
public class ScheduleService {
    /**
     * on the second as well as minute, hour, day of month, month and day of week.
     * e.g{0 * * * * MON-FRI}
     */

//    @Scheduled(cron = "0 * * * * FRI")
    @Scheduled(cron = "0-4 * * * * FRI")
    public void  hello(){
        System.out.println("Hello.....");
    }
}
