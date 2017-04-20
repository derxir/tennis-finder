package com.derxir.schedule;

import com.derxir.aop.LoggerManage;
import com.derxir.service.CaptureService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by justin on 4/4/17.
 */
public class ScheduledTask {

    private static final Logger LOG = Logger.getLogger(ScheduledTask.class);

    @Autowired
    CaptureService captureService;

    @Scheduled(cron="11 11 0 * * ?")
    @LoggerManage(description="refresh cache")
    public void putRedisCollector() {
        try {
            LOG.info("placeholder");
        }catch (Exception e){
            LOG.error("Unable to update redis cache",e);
        }
    }

    @Scheduled(cron="11 11 0 * * ?")
    @LoggerManage(description="start capturing all targets")
    public void captureAllSchedule() {

        captureService.initCapture();
    }
}
