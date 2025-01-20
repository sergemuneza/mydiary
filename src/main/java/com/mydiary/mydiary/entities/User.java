/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Class: User
> Description: Represents a user entity stored in the database.
 */

package com.mydiary.mydiary.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
}
