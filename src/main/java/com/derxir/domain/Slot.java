package com.derxir.domain;

import com.derxir.domain.eums.WEEK;

import java.util.Date;

/**
 * Created by justin on 4/20/17.
 */
public class Slot {

    private final int Ordinal;

    private final boolean availability;

    public Slot(int ordinal, boolean availability) {
        Ordinal = ordinal;
        this.availability = availability;
    }

    public int getOrdinal() {

        return Ordinal;
    }

    public boolean isAvailability() {
        return availability;
    }

}
