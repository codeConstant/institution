package com.learning.institution.opaque;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class DevOpsDto  extends InstituteDto{
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
