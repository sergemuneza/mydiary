package com.mydiary.mydiary.services;

import com.mydiary.mydiary.dto.EntryRequest;
import com.mydiary.mydiary.entities.Entry;
import com.mydiary.mydiary.repository.EntryRepository;
import com.mydiary.mydiary.services.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Override
    public Entry createEntry(EntryRequest request) {
        Entry entry = new Entry();
        entry.setTitle(request.getTitle());
        entry.setDescription(request.getDescription());
        entry.setCreatedOn(LocalDateTime.now());
        return entryRepository.save(entry);
    }

    @Override
    public Entry updateEntry(Long id, EntryRequest request) {
        Entry entry = entryRepository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
        entry.setTitle(request.getTitle());
        entry.setDescription(request.getDescription());
        entry.setUpdatedOn(LocalDateTime.now());
        return entryRepository.save(entry);
    }

    @Override
    public void deleteEntry(Long id) {
        entryRepository.deleteById(id);
    }

    @Override
    public List<Entry> getAllEntries() {
        return entryRepository.findAll();
    }

    @Override
    public Entry getEntryById(Long id) {
        return entryRepository.findById(id).orElseThrow(() -> new RuntimeException("Entry not found"));
    }
}
