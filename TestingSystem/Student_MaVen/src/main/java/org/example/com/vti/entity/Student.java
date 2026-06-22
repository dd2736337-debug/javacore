package org.example.com.vti.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private Major major;
}
