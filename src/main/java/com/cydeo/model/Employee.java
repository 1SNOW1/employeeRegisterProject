package com.cydeo.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String firstName, lastName, email, password, address, address2, city, state, zipCode;
    private LocalDate birthday;
}
