package com.reedelsevier.ordersets.applicationservice.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * User: carterp001
 * Date: 9/12/11
 * Time: 12:48 PM
 */

@Configuration
public class ApplicationBusinessObjectConfiguration {
    private
    @Autowired
    Environment env;

}
