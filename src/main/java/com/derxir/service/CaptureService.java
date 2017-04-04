package com.derxir.service;

import org.springframework.stereotype.Service;

import java.net.URL;

/**
 * Created by justin on 4/4/17.
 */
@Service
public interface CaptureService {

    void initCapture(URL url);

}
