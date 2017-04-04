package com.derxir.Schedule;

import com.derxir.aop.LoggerManage;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by justin on 4/4/17.
 */
public class ScheduledTask {

    private static final Logger LOG = Logger.getLogger(ScheduledTask.class);

    @Scheduled(cron="11 11 0 * * ?")
    @LoggerManage(description="refresh cache")
    public void putRedisCollector() {
        try {
            LOG.info("placeholder");
        }catch (Exception e){
            LOG.error("Unable to update redis cache",e);
        }
    }
}
