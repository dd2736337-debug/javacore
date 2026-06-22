package org.example.com.vti.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lecturer {
    private int id;
    private String fullName;
    private String email;
    private String department;
}
