package com.zandroid.camel.error;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("error.route")
public class CamelErrorRouteProperties {

    private String inUrl;
    private String outUrl;

    public String getInUrl() {
        return inUrl;
    }

    public void setInUrl(String inUrl) {
        this.inUrl = inUrl;
    }

    public String getOutUrl() {
        return outUrl;
    }

    public void setOutUrl(String outUrl) {
        this.outUrl = outUrl;
    }
}
