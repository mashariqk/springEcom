package org.learn.ecom.spring.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 273041 on 11/23/2016.
 */


public interface GenericRequestHandlerService {
    public boolean isSiteViewAllowed(String request);
}
