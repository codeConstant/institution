package com.learning.institution.opaque;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "core.institute")
public class Institute {
    private String title;
    private String owner;
    private int totalFaculty;
    private String address;
    private String website;
    private String program;
}
