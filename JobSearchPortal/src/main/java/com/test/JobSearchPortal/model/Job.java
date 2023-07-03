package com.test.JobSearchPortal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JobPortal")
public class Job {
    @Id
    @Column(name = "Id",unique = true)
    private Long jobId;
    private String companyName;
    private String title;
    private String description;
    private String locationCompany;
    @Min(20000)
    private Double salary;
    private String companyEmail;
    private String recruiterName;
    @Enumerated(EnumType.STRING)
    private Type jobType;
    private LocalDate postedDate;

}
