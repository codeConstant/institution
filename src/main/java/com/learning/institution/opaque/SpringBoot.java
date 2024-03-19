package com.learning.institution.opaque;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
@ConfigurationProperties(prefix = "core.framework")
public class SpringBoot {
    private String subject;
    private String name;
    private String subscription;
    private String rating;
    private String studentTotal;
    private String section;
    private String lecture;
    private String length;
    private String totalSubscription;
    private String amount;
}
