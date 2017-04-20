package com.derxir.domain;

import org.apache.log4j.Logger;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by justin on 4/4/17.
 */
public class CaptureContext {

    private static final Logger LOG = Logger.getLogger(CaptureContext.class);

    private Date capturedTime;

    private final transient List<Court> courts = new ArrayList<>();

    public CaptureContext() {
    }

    public Date getCapturedTime() {
        return capturedTime;
    }

    public void setCapturedTime(Date capturedTime) {
        this.capturedTime = capturedTime;
    }

    public List<Court> getCourts() {
        return courts;
    }

    public void addCourt(Court court){
        this.courts.add(court);
    }

}
