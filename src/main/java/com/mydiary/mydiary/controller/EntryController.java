/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Class: EntryController
> Description: This class manages CRUD operations for diary entries.
> Instance Variables:
    - entryService: A service for handling business logic related to diary entries.
> Methods:
    - createEntry(EntryRequest request): Creates a new diary entry.
    - updateEntry(Long id, EntryRequest request): Updates an existing diary entry by ID.
    - deleteEntry(Long id): Deletes a diary entry by ID.
    - getAllEntries(): Retrieves a list of all entries.
    - getEntryById(Long id): Retrieves a specific diary entry by ID.
 */

package com.mydiary.mydiary.controller;

import com.mydiary.mydiary.dto.EntryRequest;
import com.mydiary.mydiary.entities.Entry;
import com.mydiary.mydiary.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @PostMapping("/signin")
    public ResponseEntity<Map<String, Object>> createEntry(@RequestBody EntryRequest request) {
        Entry createdEntry = entryService.createEntry(request);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Entry successfully created");
        response.put("entry", createdEntry);

        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> updateEntry(@PathVariable Long id, @RequestBody EntryRequest request) {
        Entry updatedEntry = entryService.updateEntry(id, request);


        Map<String, Object> response = new HashMap<>();
        response.put("message", "Entry successfully edited");
        response.put("entry", updatedEntry);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteEntry(@PathVariable Long id) {
        entryService.deleteEntry(id);

        // Add success message to the response
        Map<String, String> response = new HashMap<>();
        response.put("message", "Entry successfully deleted");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/displayAll")
    public ResponseEntity<List<Entry>> getAllEntries() {
        return ResponseEntity.ok(entryService.getAllEntries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> getEntryById(@PathVariable Long id) {
        return ResponseEntity.ok(entryService.getEntryById(id));
    }
}
