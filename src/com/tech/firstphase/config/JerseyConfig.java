package com.tech.firstphase.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.tech.firstphase.resource.StudentResource;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() 
    {
        register(StudentResource.class);
    }
}
