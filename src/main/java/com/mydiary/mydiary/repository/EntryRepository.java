/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Interface: EntryRepository
> Description: Interface for database operations related to diary entries.
It doesn't have custom methods because it inherits default methods from JpaRepository.
 */

package com.mydiary.mydiary.repository;

import com.mydiary.mydiary.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}
