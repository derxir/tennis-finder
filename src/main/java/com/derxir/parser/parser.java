package com.derxir.parser;

import com.derxir.domain.CaptureContext;

/**
 * Created by justin on 4/4/17.
 */
public interface parser {

    CaptureContext parseResponse(String html);
}
