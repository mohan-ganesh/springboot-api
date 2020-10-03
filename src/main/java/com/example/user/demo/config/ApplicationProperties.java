package com.example.user.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Configuration
@ConfigurationProperties()
public class ApplicationProperties {

    @NotEmpty
    private String resourceUrl;

    private List<Integer> resourcePort;


    public String getResourceUrl() {
        return resourceUrl;
    }
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }


    public List<Integer> getResourcePort() {
        return resourcePort;
    }
    public void setResourcePort(List<Integer> resourcePort) {
        this.resourcePort = resourcePort;
    }

}
