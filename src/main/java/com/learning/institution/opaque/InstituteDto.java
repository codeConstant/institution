package com.learning.institution.opaque;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class InstituteDto {
    private String title;
    private String owner;
    private int totalFaculty;
    private String address;
    private String website;
    private String program;
}
