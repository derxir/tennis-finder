package com.derxir.domain;

import java.util.*;

/**
 * Created by justin on 4/20/17.
 */
public class CourtStatus {

    private Date date;

    Map<Date,List<Slot>> slots = new HashMap<>();

    public CourtStatus() {
    }

    public Map<Date,List<Slot>> getSlots() {
        return slots;
    }

    public void setSlots(Map<Date,List<Slot>> slots) {
        this.slots = slots;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
