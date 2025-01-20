/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
Class: SignupRequest
Description: A DTO for capturing user signup data.
 */


package com.mydiary.mydiary.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
