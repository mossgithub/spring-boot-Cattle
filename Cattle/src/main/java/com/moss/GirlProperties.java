package com.moss;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by feng.lin2 on 2018/4/23.
 */

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSise;
    private String age;

    public String getCupSise() {
        return cupSise;
    }

    public void setCupSise(String cupSise) {
        this.cupSise = cupSise;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
