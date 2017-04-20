package com.derxir.domain;

import java.net.URL;

/**
 * Created by justin on 4/20/17.
 */
public class Court {

    private final CourtInfo info;

    private final URL link;

    private final CourtStatus status;


    public Court(CourtInfo info, URL link, CourtStatus status) {
        this.info = info;
        this.link = link;
        this.status = status;
    }

    public CourtInfo getInfo() {
        return info;
    }

    public URL getLink() {
        return link;
    }

    public CourtStatus getStatus() {
        return status;
    }

}
