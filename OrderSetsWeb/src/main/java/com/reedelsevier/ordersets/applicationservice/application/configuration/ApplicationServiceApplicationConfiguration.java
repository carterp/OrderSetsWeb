package com.reedelsevier.ordersets.applicationservice.application.configuration;

import com.reedelsevier.ordersets.common.application.configuration.CommonApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * User: carterp001
 * Date: 9/7/11
 * Time: 1:50 PM
 */

@Configuration
@Import({CommonApplicationConfiguration.class, ApplicationServiceClientConfiguration.class, ApplicationBusinessObjectConfiguration.class})
public class ApplicationServiceApplicationConfiguration {

}
