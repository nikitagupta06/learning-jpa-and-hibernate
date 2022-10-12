package com.in28minutes.springboot.learnjpaandhibernate.course.currency;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;

    public CurrencyServiceConfiguration(String url, String username, String key) {
        this.url = url;
        this.username = username;
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getKey() {
        return key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "CurrencyController{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
