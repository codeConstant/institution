package com.learning.institution.opaque;

import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class SpringDto extends InstituteDto {
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
