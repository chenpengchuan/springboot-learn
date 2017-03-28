package com.eumji.scheduled.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Do
 * @package com.eumji.scheduled.scheduled
 * @name ScheduledTask
 * @date 2017/3/28
 * @time 14:25
 */
@Component
public class ScheduledTask {

    @Scheduled(fixedRate = 1000)
    public void task(){
        System.out.println("curren Time: "+System.currentTimeMillis());
    }
}
