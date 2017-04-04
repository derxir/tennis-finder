package com.derxir.domain;

import org.apache.log4j.Logger;

import java.net.URL;
import java.util.Date;
import java.util.Map;

/**
 * Created by justin on 4/4/17.
 */
public class CaptureContext {

    private static final Logger LOG = Logger.getLogger(CaptureContext.class);

    private Date time;

    private Map<URL, SiteInfo> UrlToSiteMap;



}
