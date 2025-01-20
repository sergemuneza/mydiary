/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Interface: EntryService
> Description: Handles business logic for diary entry operations.
> Instance Variable:
    - entryRepository: Handles database operations for entries.
> Methods:
    - createEntry(EntryRequest request): Creates and saves a new entry in the database.
    - updateEntry(Long id, EntryRequest request): Updates an existing entry in the database.
    - deleteEntry(Long id): Deletes an entry by its ID.
    - getAllEntries(): Fetches all entries from the database.
    - getEntryById(Long id): Retrieves a specific entry by its ID.
 */


package com.mydiary.mydiary.services;

import com.mydiary.mydiary.dto.EntryRequest;
import com.mydiary.mydiary.entities.Entry;

import java.util.List;

public interface EntryService {
    Entry createEntry(EntryRequest request);
    Entry updateEntry(Long id, EntryRequest request);
    void deleteEntry(Long id);
    List<Entry> getAllEntries();
    Entry getEntryById(Long id);
}
