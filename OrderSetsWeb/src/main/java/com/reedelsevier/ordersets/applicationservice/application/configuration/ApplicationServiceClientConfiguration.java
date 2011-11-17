package com.reedelsevier.ordersets.applicationservice.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * User: carterp001
 * Date: 9/7/11
 * Time: 1:57 PM
 */

@Configuration
@PropertySource("applicationservice-client.properties")
public class ApplicationServiceClientConfiguration {
    private
    @Autowired
    Environment env;

//    public
//    @Bean
//    EprServiceClient eprServiceClient() {
//        RestClient restClient = new RestClient();
//        String envProperty = env.getProperty("env");
//        String eprServiceUri = env.getProperty(envProperty + ".applicationservice.process.epr.uri");
//        Resource resource = restClient.resource(eprServiceUri);
//
//        EprServiceClient eprServiceClient = new EprServiceClientImpl(resource);
//
//        return eprServiceClient;
//    }

}
