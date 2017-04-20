package com.derxir.service;

import com.derxir.domain.CaptureContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by justin on 4/4/17.
 */
@Service
public interface CaptureService extends IService {

    void initCapture();

    CaptureContext loadCourtStatusInfo();
}
