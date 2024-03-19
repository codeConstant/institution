package com.learning.institution.controller;

import com.learning.institution.opaque.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FacultyController {

    private final Institute institute;

    private final SpringBoot springBoot;

    private final DevOps devOps;


    @GetMapping("local")
    public Object local() {
        return InstituteDto.builder()
                .title(institute.getTitle())
                .address(institute.getAddress())
                .owner(institute.getOwner())
                .totalFaculty(institute.getTotalFaculty())
                .website(institute.getWebsite())
                .program(institute.getProgram())
                .build();
    }

    @GetMapping("staging")
    public Object stag() {
        return SpringDto.builder()
                .subject(springBoot.getSubject())
                .title(institute.getTitle())
                .address(institute.getAddress())
                .owner(institute.getOwner())
                .totalFaculty(institute.getTotalFaculty())
                .website(institute.getWebsite())
                .program(institute.getProgram())
                .name(springBoot.getName())
                .subscription(springBoot.getSubscription())
                .rating(springBoot.getRating())
                .studentTotal(springBoot.getStudentTotal())
                .section(springBoot.getSection())
                .lecture(springBoot.getLecture())
                .length(springBoot.getLength())
                .totalSubscription(springBoot.getTotalSubscription())
                .amount(springBoot.getAmount())
                .build();
           }

    @GetMapping("production")
    public Object prod() {
        return DevOpsDto.builder()
                .subject(devOps.getSubject())
                .title(institute.getTitle())
                .address(institute.getAddress())
                .owner(institute.getOwner())
                .totalFaculty(institute.getTotalFaculty())
                .website(institute.getWebsite())
                .program(institute.getProgram())
                .name(devOps.getName())
                .subscription(devOps.getSubscription())
                .rating(devOps.getRating())
                .studentTotal(devOps.getStudentTotal())
                .section(devOps.getSection())
                .lecture(devOps.getLecture())
                .length(devOps.getLength())
                .totalSubscription(devOps.getTotalSubscription())
                .amount(devOps.getAmount())
                .build();
    }
}
